//Íàéäèòå ñóììó ïåðâûõ n öåëûõ ÷èñåë, êîòîðûå äåëÿòñÿ íà 3.
// n çàäà¸ì ÷åðåç ïàðàìåòð, åñëè îí ïóñò, òî ñëó÷àéíîå ÷èñëî îò 0 äî 20
public class Zadanie12 {
    public static void main(String[] args){
    int n = 0;
    if (args.length > 0) {
       n = Integer.parseInt(args[0]);
    } else { 
       n = (int)(Math.random()*20);
    }
    int i = 0, sum = 0, j = 0;
    while (i < n) {
       j++;
       if (j % 3 == 0) {
          sum+= j;
          i++;
       }
     }
     System.out.println ("Ñóììà ïåðâûõ " + n + " ÷èñåë, êîòîðûå äåëÿòñÿ íà 3 = " + sum);
  }
}
