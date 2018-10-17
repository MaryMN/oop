package lab4;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.util.Arrays;
import java.util.List;
import static lab4.CheckParantheses.areParenthesisBalanced;
public class Main {
    //  static String content ;
    //  List<String> lines;
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("D:\\Program Files\\java\\src\\lab4\\one.txt" ));
        System.out.println(lines);

        char[]  exp =lines.toString().toCharArray();
        if(areParenthesisBalanced(exp))
            System.out.println("The expression is correct!");
        else System.out.println("The expression is not correct!");
    }
}


