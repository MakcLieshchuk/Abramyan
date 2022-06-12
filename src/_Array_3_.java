import java.util.Scanner;

public class _Array_3_ {
    public static void main(String[] args) {
//Дано целое число N (> 1), а также первый член A и разность D арифметической прогрессии.
// Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
//  A, A + D, A + 2·D, A + 3·D, . . . .
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть N");
        int N = sc.nextInt();
        System.out.println("Введіть A");
        int A = sc.nextInt();
        System.out.println("Введіть D");
        int D = sc.nextInt();
        int [] Array = new int[N];
        Array [0] = A;
        for (int i = 1; i < N; i++) {
            Array [i] = A + (i * D);
        }
        for (int i = 0; i < N; ++i) {
            System.out.println("Array["+i+"] ="+Array[i]);
        }
    }
}
