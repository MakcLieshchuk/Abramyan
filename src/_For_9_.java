import java.util.Scanner;

public class _For_9_ {
    public static void main(String[] args) {
        // Дано 2 цілих числа А і В (A<B). Знайти суму квадратів усіх цілих чисел від А до В включно.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A & B");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double Sum_Pow = 0;
        for (double i = A; i <=B ; i++) {
            Sum_Pow += Math.pow(i, 2);
        } System.out.println("Сума квадратів чисел складає " + Sum_Pow);
    }
}
