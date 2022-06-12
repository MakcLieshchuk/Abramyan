import java.lang.reflect.Array;
import java.util.Scanner;

public class _Array_2_ {
    public static void main(String[] args) {

    // Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный
    //массив размера N, содержащий степени двойки от первой до N-й: 2, 4,
    //8, 16, . . . .
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double [] A = new double[N];
        for (int i = 0; i <= N; i++) {
            A[i] = (double) Math.pow(i,2);
        }
        for (int i = 0; i <=N; i++) {
            System.out.print(A[i]+", ");
        }
    }
}