import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("달을 입력하세요.");
            System.out.print("> ");

            int month = scanner.nextInt();
            if (month == -1) {
                System.out.println("Have a nice day!");
                break;
            }
            if (month > 12 || month < 1) {
                System.out.println("1부터 12까지의 숫자를 입력해주세요.");
                continue;
            }

            System.out.println(month + "월은 " + monthArray[month - 1] + "일까지 있습니다.");
        }
        scanner.close();
    }
}