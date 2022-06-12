import java.util.Scanner;

public class _Array_4_ {
    public static void main(String[] args) {
//Array4. Дано целое число N (> 1), а также первый член A и знаменатель D
//геометрической прогрессии. Сформировать и вывести массив размера N,
//содержащий N первых членов данной прогрессии:
//A, A·D, A·D2, A·D3, . . . .
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть змінну N");
        int N = sc.nextInt();
        System.out.println("Введіть змінну A");
        int A = sc.nextInt();
        System.out.println("Введіть змінну D");
        int D = sc.nextInt();
        int [] Array = new int[N];
        Array [0] = A;
        Array [1] = A * D;
        for (int i = 2; i < N; i++) {
            Array [i] = Array[i-1] * D;
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Array["+i+"] = "+Array[i]+", ");
        }
    }
}
