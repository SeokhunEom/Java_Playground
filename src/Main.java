import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number : " + number);

        int result = number * 1;
        System.out.println(result);

        result = number * 2;
        System.out.println(result);

        result = number * 3;
        System.out.println(result);

        result = number * 4;
        System.out.println(result);

        result = number * 5;
        System.out.println(result);

        result = number * 6;
        System.out.println(result);

        result = number * 7;
        System.out.println(result);

        result = number * 8;
        System.out.println(result);

        result = number * 9;
        System.out.println(result);
    }
}