//������� ����� �����, ���������� �������� �� ��� ����� �������, �.�.
//������� ��� ������� ������ �� 1 � ����.
// ����� ������� ��� ��������. ���� ��������� ���, �� ������ ���������
public class Zadanie11 {
    public static void main(String[] args){
    int i = 0;
    int y = 0, x = 0;
    if (args.length > 0) {
       x = Integer.parseInt(args[0]);
    } else { 
       x = (int)(Math.random()*20);
    }
    for (i=2; i <=x; i++)  {
       if (x % i == 0) break;
    }
       if ((i == x) || (x == 0) || (x == 1)) {
          System.out.println ("�����: " + x + " �������� �������");
       } else {
          System.out.println ("�����: " + x + " �� �������� �������");
       }
}
}
