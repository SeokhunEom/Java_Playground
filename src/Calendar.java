public class Calendar {
    public static void drawCalendar(int year, int month) {
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            monthArray[1] = 29;
        }

        System.out.println("    <<" + year + "년 " + month + "월>>");
        System.out.println("일  월  화  수  목  금  토");
        System.out.println("-------------------");
        for (int i = 1; i <= monthArray[month - 1]; i++) {
            System.out.printf("%3d", i);
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
