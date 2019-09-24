//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).
public class Zadanie15 {
    public static void main(String[] args){
    int array [] = new int[20];
    int n = 0, a = 0, b = 0;
    // заполняем
    for (i = 0; i < array.length; i ++) {
       array[i] = (int)(Math.random()*200);
       //System.out.print("Элемент: " + i + " = " + array[i]);
       System.out.print(array[i]+",");
    }
    System.out.println ("");
   // переворачиваем 
    for (i = 0; i < array.length/2; i ++) {
       a = array[i];
       b = array[array.length-1-i];
       array[i] = b;
       array[array.length-1-i] = a;
    }
    for (i = 0; i < array.length; i ++) {
       //System.out.print("Элемент: " + i + " = " + array[i]);
       System.out.print(array[i]+",");
    }
 
 }
}
