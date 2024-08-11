import java.util.Calendar;

public class MyCalendar {

    public static final int[] MONTH_ARRAY = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void drawCalendar(int year, int month) {
        if (isLeapYear(year)) MONTH_ARRAY[1] = 29;
        int day1Num = getDay1(year, month);
        System.out.println(day1Num);

        System.out.println("    <<" + year + "년 " + month + "월>>");
        System.out.println("SU MO TU WE TH FR SA");
        System.out.println("-------------------");
        if(day1Num != 0) System.out.printf("%" + (day1Num * 3) + "s", "");
        for (int i = 1; i <= MONTH_ARRAY[month - 1]; i++) {
            System.out.printf("%3d", i);
            if ((i + day1Num) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int dayToNum(String day) {
        return switch (day) {
            case "SU" -> 0;
            case "MO" -> 1;
            case "TU" -> 2;
            case "WE" -> 3;
            case "TH" -> 4;
            case "FR" -> 5;
            case "SA" -> 6;
            default -> -1;
        };
    }

    private static int getDay1(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }
}
