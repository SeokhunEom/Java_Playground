import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("달을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(month + "월은 " + monthArray[month - 1] + "일까지 있습니다.");
    }
}