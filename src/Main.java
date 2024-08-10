import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("두 수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("두 수의 합은 " + (a + b) + "입니다.");
    }
}