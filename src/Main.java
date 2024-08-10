public class Main {
    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            System.out.println(j + "단");
            Gugudan.print(Gugudan.calculate(j));
        }
    }
}