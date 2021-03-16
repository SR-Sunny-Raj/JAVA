public class App {
    public static void main(String[] args) throws Exception {
        // length()
        String s1 = "Sunny Raj";
        int i = s1.length();
        System.out.println(i);

        // isEmpty() and isBlank()
        String s2 = "   ";
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());

        // charAt
        char c = s1.charAt(2);
        System.out.println(c);

        // indexOf() and lastIndexOf()
        String s3 = "abcd";
        String s4 = "abcda";
        System.out.println(s3.indexOf('a'));
        System.out.println(s4.lastIndexOf('a'));

        // concat()
        String s5 = "Sunny";
        String s6 = " Raj";
        System.out.println(s5.concat(s6));
    }
}
