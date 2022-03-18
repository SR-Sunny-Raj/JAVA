import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
            // ArrayList<TreeMap<Integer, Integer>> arr = new ArrayList<TreeMap<Integer,
            // Integer>>();
            for (int i = 0; i < N; i++) {
                tm.put(input.nextInt(), 0);
            }
            // arr.add(tm);
            for (int i = 0; i < N; i++) {
                tm.put(input.nextInt(), 1);
            }
            // arr.add(tm);
            int ans = 0, count = 0;
            for (Map.Entry<Integer, Integer> e : tm.entrySet()) {
                if (e.getValue() == 0)
                    count++;
                else
                    count--;
                ans = Math.max(ans, count);
            }
            System.out.println(tm);
            System.out.println(ans);
        }
        input.close();
    }
}
