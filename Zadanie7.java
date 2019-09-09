// Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
// полностью закрыть круглой картонкой радиусом r.
import static java.lang.Math.*;
public class Zadanie7 {
    public static void main(String[] args){
       int a=100;
       int b=200;
       int r=300;
       double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
       if (r*2 > c) {
          System.out.println( "Отверствие можно полностью закрыть");
       } 
       else {
       System.out.println( "Отверствие нельзя полностью закрыть");
       }
    }
}
