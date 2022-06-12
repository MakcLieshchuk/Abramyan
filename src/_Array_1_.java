import java.util.Scanner;

public class _Array_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = 1 + i * 2;
        }
        for (int i = 0; i < N; ++i) {
            System.out.println("A[" + i + "]=" + A[i]);
        }
    }
}

