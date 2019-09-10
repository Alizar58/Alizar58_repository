// Определите сумму элементов одномерного массива, расположенных между
// минимальным и максимальным значениями.
public class Zadanie16 {
    public static void main(String[] args){
    int array [] = {1,7,5,6,3,15,10,5,4,6,4,2,8,6,9};
    int i = 0, mi = 100, ma = 0, nmin = 0, nmax=0, sum = 0;
    for (i = 0; i < array.length; i ++) {
       if (array[i] > ma) {ma = array[i]; nmax = i;}
       if (array[i] < mi) {mi = array[i]; nmin = i;}
    }
    if (nmin < nmax) {
       for (i = nmin + 1; i < nmax; i++) sum += array[i];
    } else {
    for (i = nmax + 1; i < nmin; i++) sum += array[i];
    }
    System.out.println ("Сумма элементов между максимальным и минимальным значениями = " + sum );
    }
}
