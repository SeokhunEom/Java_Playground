import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("반복횟수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("달을 입력하세요.");
            int month = scanner.nextInt();
            System.out.println(month + "월은 " + monthArray[month - 1] + "일까지 있습니다.");
        }

        scanner.close();
    }
}