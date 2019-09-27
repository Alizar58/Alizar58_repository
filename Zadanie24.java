//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.
//Сделать методы для получения полного количества секунд в объекте, сравнения
//двух объектов (метод должен работать аналогично compareTo в строках). Создать
//два конструктора: получающий общее количество секунд, и часы, минуты и секунды.
//по отдельности. Сделать метод для вывода данных.
import package1.AnyTime;

public class Zadanie24 {
    public static void main(String[] args){
     AnyTime ltime1 = new AnyTime();
     AnyTime ltime2 = new AnyTime();
     ltime1.getTime(4512);
     ltime1.printAnyTime();
     ltime2.getTime(4, 5, 12);
     ltime2.printAnyTime();
     System.out.println("Результат сравнения (11-1й больше, 0- равны, -11 1-й меньше): " + ltime1.CompareTime(ltime2));
 }
}
