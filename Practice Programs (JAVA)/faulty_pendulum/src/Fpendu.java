import java.util.*;

public class Fpendu {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int Num = input.nextInt();
        int[] srr = new int[Num];
        int dis = input.nextInt();
        String dirstr = input.next();
        for (int i = 0; i < Num; i++) {
            srr[i] = input.nextInt();
        }

        int sumdis = 0;
        if (dirstr.equals("Right")) {
            sumdis = dis;
        } else {
            sumdis = 0 - dis;
        }
        int flag = 0;

        if (sumdis == 0 && srr.length == 0) {
            // System.out.println("Possible");
            flag = 1;
        } else if (srr.length == 1) {
            if ((sumdis + srr[0] == 0) || (sumdis - srr[0] == 0) || (-sumdis + srr[0] == 0)
                    || (-sumdis - srr[0] == 0)) {
                // System.out.println("Possible");
                flag = 1;
            }
        } else {
            ArrayList<Integer> rrr = new ArrayList<>();
            rrr.add(srr[0] + srr[1]);
            rrr.add(srr[0] - srr[1]);
            rrr.add(srr[1] - srr[0]);
            rrr.add(-srr[0] - srr[1]);

            int j = 0, k = 4, pos = 3;
            for (int i = 2; i < Num; i++) {
                for (; j < k; j++) {
                    rrr.add(srr[i] + rrr.get(j));
                    rrr.add(srr[i] - rrr.get(j));
                    rrr.add(rrr.get(j) - srr[i]);
                    rrr.add(-rrr.get(j) - srr[i]);
                    pos += 4;
                }
                j = k;
                k = pos;
            }

            for (int m = 0; m < rrr.size(); m++) {
                if (sumdis + rrr.get(m) == 0) {
                    // System.out.println("Possible");
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.print("Not Possible");
        } else {
            System.out.print("Possible");
        }

        // int sumdis = 0;
        // if (dirstr.equals("Right")) {
        // sumdis = dis;
        // } else {
        // sumdis = 0 - dis;
        // }
        // check(Num, sumdis, srr);
        // for (int i = 0; i < Num; i++) {
        // if (sumdis == 0) {
        // flag = 1;
        // break;
        // } else if (sumdis > 0) {
        // sumdis -= srr[i];
        // } else {
        // sumdis += srr[i];
        // }
        // }
        input.close();
    }

    // Function to check if it's possible for the pendulum to bring to rest or not.
    // If it's possible then we are printing Possible as the output and then simply
    // returning from the function
    // else we are just checking for the values in the array
    static void check(int N, int sdist, int[] rrr) {
        for (int i = 0; i < N; i++) {
            if (sdist > 0) {
                sdist -= rrr[i];
            } else if (sdist < 0) {
                sdist += rrr[i];
            } else if (sdist == 0) {
                System.out.print("Possible");
                return;
            }
        }
        System.out.print("Not Possible");
    }
}
