//�������� ���������, ����������� ����� � ������ ���� ����� �������, � �.�. ���, �
//������� ���� ���������, �������� <p id=�p1�>, � ������ �� �� ������� ����
//������� <p>.
import java.util.regex.*;
public class Zadanie23 {
    public static void main(String[] args){
    String str = "��� ������ ��� ������: <p id=�p1�>, ��� ������ ��� ������: <p id=�p2�>";
    System.out.println("�������� ������:");
    System.out.println(str);
    Pattern pattern = Pattern.compile("<.+?>");
    Matcher matcher = pattern.matcher(str);
    str = matcher.replaceAll("<p>");
    System.out.println("������ ����� ������:");
    System.out.println(str);
 }
}
