//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.
import java.util.regex.*;
public class Zadanie23 {
    public static void main(String[] args){
    String str = "это первый тег абзаца: <p id=”p1”>, это второй тег абзаца: <p id=”p2”>";
    System.out.println("Исходная строка:");
    System.out.println(str);
    Pattern pattern = Pattern.compile("<.+?>");
    Matcher matcher = pattern.matcher(str);
    str = matcher.replaceAll("<p>");
    System.out.println("Строка после замены:");
    System.out.println(str);
 }
}
