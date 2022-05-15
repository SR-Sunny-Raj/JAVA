import java.util.Scanner;

public class App {
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
        check(Num, sumdis, srr);
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
