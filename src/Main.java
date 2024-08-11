import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prompt(scanner);
        scanner.close();
    }

    private static void prompt(Scanner scanner) {
        while (true) {
            System.out.println("년도을 입력하세요.");
            System.out.print("> ");
            int year = scanner.nextInt();

            System.out.println("월을 입력하세요.");
            System.out.print("> ");
            int month = scanner.nextInt();
            if (month == -1) {
                System.out.println("종료합니다.");
                break;
            }
            if (month > 12 || month < 1) {
                System.out.println("1부터 12까지의 숫자를 입력해주세요.");
                continue;
            }

            System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
            System.out.print("> ");
            String day1 = scanner.next().toUpperCase();
            if (!day1.equals("SU") && !day1.equals("MO") && !day1.equals("TU") && !day1.equals("WE") && !day1.equals("TH") && !day1.equals("FR") && !day1.equals("SA")) {
                System.out.println("잘못된 요일을 입력하셨습니다.");
                continue;
            }

            Calendar.drawCalendar(year, month, day1);
        }
    }
}