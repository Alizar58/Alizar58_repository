// ������� ������ ������ ������������ �����, ������� ������������ � 
// ����������� ������, � (��) ������.
public class Zadanie14 {
    public static void main(String[] args){
    int array [] = {1,7,5,6,3,15,10,5,4,6,4,2,8,6,9};
    int i = 0, mi = 100, ma = 0, nmin = 0, nmax=0;
    for (i = 0; i < array.length; i ++) {
       if (array[i] > ma) {ma = array[i]; nmax = i;}
       if (array[i] < mi) {mi = array[i]; nmin = i;}
    }
    System.out.println ("������������ ������ �  " + nmax + " = "+ma+", ����������� ������ � " + nmin + " = " + mi );
    }
}
