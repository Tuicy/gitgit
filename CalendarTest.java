import java.time.*;

/**
 * calendar
 */

public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int daysofMonth = date.getDayOfMonth();
        System.out.println("daysofMonth = date.getDayOfMonth():" + daysofMonth);
        System.out.println("==========================");
        date = date.minusDays(daysofMonth - 1); // Set to start of month
        System.out.println("date = date.minusDays(daysofMonth - 1)：" + date);
        System.out.println("==========================");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday,... 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1;i < value;i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == daysofMonth)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
