import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prompt(scanner);
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록           |");
        System.out.println("| 2. 일정 검색           |");
        System.out.println("| 3. 달력 보기           |");
        System.out.println("| h. 도움말 q. 종료       |");
        System.out.println("+----------------------+");
    }

    private static void registerSchedule(Scanner scanner) {
        System.out.println("[일정 등록] 날짜를 입력하세요. (yyyy-MM-dd)");
        System.out.print("> ");
        String date = scanner.next();

        System.out.println("일정을 입력하세요.");
        System.out.print("> ");
        String schedule = scanner.next();

        System.out.println("date: " + date + ", schedule: " + schedule);

        MyCalendar.addSchedule(date, schedule);
        System.out.println("일정이 등록되었습니다.");
    }

    private static void searchSchedule(Scanner scanner) {
        System.out.println("[일정 검색] 날짜를 입력하세요. (yyyy-MM-dd)");
        System.out.print("> ");
        String date = scanner.next();

        MyCalendar.showSchedule(date);
    }

    private static void viewCalendar(Scanner scanner) {
        System.out.println("년도를 입력하세요.");
        System.out.print("> ");
        int year = scanner.nextInt();
        System.out.println("월을 입력하세요.");
        System.out.print("> ");
        int month = scanner.nextInt();
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        MyCalendar.drawCalendar(year, month);
    }

    private static void prompt(Scanner scanner) {
        printMenu();
        while (true) {
            System.out.println("명령 (1, 2, 3, h, q)");
            System.out.print("> ");
            String cmd = scanner.next();
            switch (cmd) {
                case "1":
                    registerSchedule(scanner);
                    break;
                case "2":
                    searchSchedule(scanner);
                    break;
                case "3":
                    viewCalendar(scanner);
                    break;
                case "h":
                    printMenu();
                    break;
                case "q":
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 명령어입니다.");
                    break;
            }
        }
    }
}