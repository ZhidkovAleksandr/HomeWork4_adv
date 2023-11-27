package Task3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateOfBirth = LocalDateTime.of(1993, 8, 22, 15, 00, 30);
        LocalDateTime momentNow = LocalDateTime.now();
        LocalDate yearMonthBirth = LocalDate.of(1993, 8,22);
        LocalDate dateToday      = LocalDate.now();
        Period per = Period.between(yearMonthBirth, dateToday);
        Duration dur = Duration.between(dateOfBirth, momentNow);

        System.out.printf(
                "%dyear %dmonths %ddays%n",
                per.getYears(),
                per.getMonths() ,
                per.getDays()
        );

        System.out.printf(
                "%dhours %dminutes%n",
                dur.toHours() % 24,
                dur.toMinutes() % 60
        );
    }
}
