import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] splitedValue = input.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        for(int i = first; i <= second; i++) {
            System.out.println(i + "단");
            Gugudan.print(Gugudan.calculate(i));
        }
    }
}