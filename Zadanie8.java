//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
import java.util.*;
public class Zadanie8 {
    public static void main(String[] args){
    Random rand = new Random();
    int x = rand.nextInt(10000);
    int n = (x % 10);
    // проверки последней цифры мало, от 11 до 19 читается как рублей
    int m = (x % 100);
    if (m > 10 & m < 20) {
       n = m;
    }
    switch (n) {
      case 1:
        System.out.println(x + " Рубль");
        break;
      case 2:
      case 3:
      case 4:
        System.out.println(x + " Рубля");
        break;
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 0:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
        System.out.println(x + " Рублей");
        break;
}
    }
}
