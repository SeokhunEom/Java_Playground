import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class MyCalendar {

    public static final int[] MONTH_ARRAY = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static HashMap<String, ArrayList<String>> scheduleMap = new HashMap<>();

    public static void drawCalendar(int year, int month) {
        if (isLeapYear(year)) MONTH_ARRAY[1] = 29;
        int day1Num = getDay1(year, month);
        System.out.println(day1Num);

        System.out.println("    <<" + year + "년 " + month + "월>>");
        System.out.println("SU  MO  TU  WE  TH  FR  SA");
        System.out.println("-------------------");
        if(day1Num != 0) System.out.printf("%" + (day1Num * 4) + "s", "");
        for (int i = 1; i <= MONTH_ARRAY[month - 1]; i++) {
            System.out.printf("%3d", i);
            if (scheduleMap.containsKey(String.format("%04d-%02d-%02d", year, month, i))) {
                System.out.print(".");
            } else {
                System.out.print(" ");
            }
            if ((i + day1Num) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int getDay1(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static void addSchedule(String date, String schedule) {
        if (scheduleMap.containsKey(date)) {
            scheduleMap.get(date).add(schedule);
        } else {
            ArrayList<String> schedules = new ArrayList<>();
            schedules.add(schedule);
            scheduleMap.put(date, schedules);
        }
    }

    public static void showSchedule(String date) {
        if (scheduleMap.containsKey(date)) {
            ArrayList<String> schedules = scheduleMap.get(date);
            System.out.println("총 " + schedules.size() + "개의 일정이 있습니다.");
            for (int i = 0; i < schedules.size(); i++) {
                System.out.println((i + 1) + ". " + schedules.get(i));
            }
        } else {
            System.out.println("일정이 없습니다.");
        }
    }
}
