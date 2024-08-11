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
            if (year == -1) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.println("월을 입력하세요.");
            System.out.print("> ");
            int month = scanner.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("1부터 12까지의 숫자를 입력해주세요.");
                continue;
            }

            MyCalendar.drawCalendar(year, month);
        }
    }
}