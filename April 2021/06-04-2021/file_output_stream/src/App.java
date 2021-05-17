import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) throws Exception {
        int i;
        FileOutputStream fout = new FileOutputStream("./file.txt");
        String s = "Sunny Raj";
        char[] ch = s.toCharArray();
        for (i = 0; i < s.length(); i++) {
            fout.write(ch[i]);
        }
        fout.close();
    }
}
