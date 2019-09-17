//Ќаписать программу, выполн€ющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=Фp1Ф>, и замену их на простые теги
//абзацев <p>.
import java.util.regex.*;
public class Zadanie23 {
    public static void main(String[] args){
    String str = "это первый тег абзаца: <p id=Фp1Ф>, это второй тег абзаца: <p id=Фp2Ф>";
    System.out.println("»сходна€ строка:");
    System.out.println(str);
    Pattern pattern = Pattern.compile("<.+?>");
    Matcher matcher = pattern.matcher(str);
    str = matcher.replaceAll("<p>");
    System.out.println("—трока после замены:");
    System.out.println(str);
 }
}
