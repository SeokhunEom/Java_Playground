import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

            Calendar.drawCalendar(year, month);
        }

        scanner.close();
    }


}