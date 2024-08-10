import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else if (number > 9) {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        } else {
            System.out.println("number = " + number);

            for (int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}