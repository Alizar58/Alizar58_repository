// Создайте число. Определите, является ли число трехзначным. Определите, является
//  ли его последняя цифра семеркой. Определите, является ли число четным.
public class Zadanie6 {
    public static void main(String[] args) {
        int n = 147;
        if ((n > 99) & (n < 1000)) {
            System.out.println("Число является трехзначным");
        } else {
            System.out.println("Число не является трехначным");
    }
    if (n % 10 == 7) {
        System.out.println("Последняя цифра 7");
    } else  {
        System.out.println("Число заканчивается не на 7");
    }
   if (n %2 == 0)
    {
        System.out.println("Число является четным");
    } else  {
        System.out.println("Число является нечетным");
    }
}
}

