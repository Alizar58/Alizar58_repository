//Создать последовательность случайных чисел, найти и вывести наибольшее из них.
public class Zadanie13 {
    public static void main(String[] args){
    int i = 0;
    int m = 0, x = 0;
    x = (int)(Math.random()*200);
    for (i=1; i <=20; i++)  {
       x = (int)(Math.random()*200);
       System.out.println ("Число: " + i + " = " + x);
       if (x > m) m = x;
      }
      System.out.println ("Максимальное число: " + m );
  }
}
