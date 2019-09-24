//проверка различности чисел 4-х значного 
public class Zadanie5 {
 public static void main(String[] args) {
int n = 1234;
int l1 = n/1000;
int d1 = n-(l1*1000);
int l2 = d1/100;
int d2 = d1-(l2*100);
int l3 = d2/10;
int l4 = d2-(l3*10);
if (l1 != l2 && l1 != l3 && l1 != l4 && l2 != l3 && l2 != l4 && l3 != l4)
{
 System.out.println(" ¬се числа различны" );
} else {
 System.out.println(" ≈сть повтор€ющиес€" );
}
}
}

