import java.util.Scanner;

public class _For_36_ {
    public static void main(String[] args) {
        // Дано цілі додаткові числа N i K. Знайти суму 1(в степені К) + 2(в степені К)+ ... N(в степені К).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N and K");
        double N = sc.nextDouble();
        double K = sc.nextDouble();
        double Sum_of_stupeniv = 0;
        for (int i = 0; i <= N; i++) {
            Sum_of_stupeniv += Math.pow(i, K);
        }System.out.println("Cума ступенів К складає " + Sum_of_stupeniv);
    }
}
