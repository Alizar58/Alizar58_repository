//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1

public class Zadanie17 {
    public static void main(String[] args){
    int[][] array = new int[7][7];
    int i = 0, j = 0;
    for (i = 0; i < array.length; i ++) {
        if (i <= array.length/2) {
           for (j = 0+i; j < array[i].length-i; j++) { array[i][j] = 1;}
        } else {
           for (j = array[i].length-1-i; j < 1+i; j++) {array[i][j] = 1;}
        }
    }
    for (i = 0; i < array.length; i ++) {
      for (j = 0; j < array[i].length; j ++) { System.out.print (array[i][j] + "\t" ); }
          System.out.println (" " );
    }
 }
}
