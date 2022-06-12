import java.util.Scanner;

public class _Boolean_3 {
    public static void main(String[] args) {
        // Дано ціле число А. Перевірити істинність твердження : "Число А є парним"
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        boolean Istina = (A % 2) == 0;
        System.out.println(Istina);
    }
}
