//�������� ������ � ������ ����� ����� �������, ����� �������������� �� �����, �
//������������, �.�. ��������� �����.
public class Zadanie9 {
    public static void main(String[] args){
    double averageSum = 0;
    double sum = 0;
    int n = 0;
    int x = (int)(Math.random() * 20);
    while(x != 0) {
       if (n == 0) {
         sum += x;
       } else {
         sum = sum + sum*x;
       }
       n ++;
       System.out.println("����: " + sum + "  - �� " + n + " ��������� �� " + x);
       x = (int)(Math.random()*20);
    }
    if(n != 0){
       averageSum = sum / n;
    } else {
       averageSum = 0;
    }
    System.out.println("�������:" + averageSum);
    }
}
