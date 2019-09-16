//�������� ���������, ����������� ����� � ������ ����������������� �����,
//��������� �� �������� Java, � ������� ���������� ��������� � ������� �� ��
//��������.
import java.util.regex.*;
public class Zadanie22 {
    public static void main(String[] args){
    String str = "��� ������ ����������������� ���� 0xF02, ��� ������ ����������������� ���� 0xF020A";
    Pattern pattern = Pattern.compile("-?x[A-F[0-9]]+");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
        System.out.println(str.substring(matcher.start(), matcher.end()));
    }
 }
}
