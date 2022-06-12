import java.util.Scanner;

public class _Case_5_ {
    public static void main(String[] args) {
   // арифметичні дії над числами пронумеровані наступним чином: 1- додавання; 2- Віднімання; 3-множення; 4- ділення.
   // Дано номер дії N (ціле число в діапазоні 1-4) і речові числа А і В (В не дорівнює 0). Виконати над числами вказану
   // дію і вивести результат.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести А і В");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println("Ввести N дії");
        int N = sc.nextInt();
        switch (N){
            case 1:
                System.out.println(A+B);
                break;
            case 2:
                System.out.println(A-B);
                break;
            case 3:
                System.out.println(A*B);
                break;
            case 4:
                System.out.println(A/B);
                break;
        }
    }
}
