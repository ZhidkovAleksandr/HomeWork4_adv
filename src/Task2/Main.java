package Task2;

import java.util.Scanner;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть вираз українською мовою");
        String checkingText = sc.nextLine();
        sc.close();
        System.out.println(checkingText);

        String str = checkingText.replaceAll("(?<!\\S)(?:без|в|до|для|на|над|не|на|но|за|то|пiд|у|серед|проти|крiм|бiля|з|через|по|крiзь)(?!\\S)", "Java");

        System.out.println(str);

    }
}