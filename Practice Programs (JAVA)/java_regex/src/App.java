import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    public static void main(String[] args) throws Exception {
        String str = "Sunny is a good boy";
        Pattern pat = Pattern.compile("sunny", Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(str);
        boolean b = mat.find();
        if (b) {
            System.out.println("Found");
        } else
            System.out.println("Not Found");
    }
}
