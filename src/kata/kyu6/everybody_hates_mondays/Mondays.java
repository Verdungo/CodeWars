package kata.kyu6.everybody_hates_mondays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mondays {

    static long count(final LocalDate birthday, final LocalDate today) {
        LocalDate twentyTwo = birthday.plus(22, ChronoUnit.YEARS);
        LocalDate seventyEight = birthday.plus(78, ChronoUnit.YEARS);

        if (today.isBefore(twentyTwo))
            return 0;

        int count = 0;
        LocalDate tempDate = twentyTwo;

        while (!tempDate.isAfter(today.isAfter(seventyEight) ? seventyEight.minus(1, ChronoUnit.DAYS) : today)) {
            if (tempDate.getDayOfWeek().equals(DayOfWeek.MONDAY)) count++;
            tempDate = tempDate.plus(1, ChronoUnit.DAYS);
        }

        return count;
    }
}
