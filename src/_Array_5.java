import java.util.Scanner;

public class _Array_5 {
// Array5. Дано целое число N (> 2). Сформировать и вывести целочисленный
//массив размера N, содержащий N первых элементов последовательности
//чисел Фибоначчи Fk: F1 = 1, F2 = 1, Fk = Fk−2 + Fk−1, K = 3, 4, . . . .
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Введите N");
    int N = sc.nextInt();
    int [] Array = new int[N];
    Array [0] = 1;
    Array [1] = 1;
    for (int i = 2; i < N; i++) {
    Array [i] = Array[i-2] + Array[i-1];
        }
    for (int i = 0; i < N; ++i) {
        System.out.println("Array["+i+"] =" + Array[i]);
    }
    }
}
