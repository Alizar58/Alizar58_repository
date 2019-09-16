//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.
import java.util.regex.*;
public class Zadanie22 {
    public static void main(String[] args){
    String str = "это первое шестнадцатиричное чило 0xF02, это второе шестнадцатиричное чило 0xF020A";
    Pattern pattern = Pattern.compile("-?x[A-F[0-9]]+");
    Matcher matcher = pattern.matcher(str);
    while (matcher.find()) {
        System.out.println(str.substring(matcher.start(), matcher.end()));
    }
 }
}
