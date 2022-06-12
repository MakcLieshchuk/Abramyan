import java.util.Scanner;

public class _DescTop {
    public static void main(String[] args) {
        // if 3. Дано ціле число. Якщо воно додаткове, додати до нього, додати до нього 1;
        // в протилежному випадку відняти від нього 2; якщо нулевим, то замінити його на 10. Вивести отримане число.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ціле число");
        int numeric = sc.nextInt();
        System.out.println("Наше число  " + numeric);
         if (numeric == 0)
        {
            System.out.println("Оскільки число = 0 , йому присвоєно значення  " + (numeric = 10));
        } else  {if (numeric > 0)
            {
            System.out.println("Оскільки число додаткове, збільшуємо його на 1, відповідь " + (numeric + 1));
    } else  {
                System.out.println("Оскільки число від’ємне, зменшимо його на 2, відповідь " + (numeric - 2));
            }
    }
    }
}