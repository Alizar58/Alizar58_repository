// печать числа в обратном порядке
public class Zadanie4 {
 public static void main(String[] args) {
int n = 1234;
int l1 = n/1000;
int d1 = n-(l1*1000);
int l2 = d1/100;
int d2 = d1-(l2*100);
int l3 = d2/10;
int l4 = d2-(l3*10);
int m = l4*1000+l3*100+l2*10+l1;
 System.out.println("1-ое: " + l1 + ", 2-ое: " + l2 + ", 3-ое: " + l3 + ",4-ое: " + l4 + ", обратный порядок: " + m);
}
}

