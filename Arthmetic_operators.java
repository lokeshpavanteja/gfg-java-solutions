import java.util.*;

class Solution {
    public int[] computeOperations(int x, int y) {

        int p = x + y;
        int q = x - y;
        int r = x * y;

        int s = 0, t = 0;

        // avoid division by zero
        if (y != 0) {
            s = x / y;
            t = x % y;
        }

        return new int[] { p, q, r, s, t };
    }
}

public class Arthmetic_operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        Solution obj = new Solution();
        int[] ans = obj.computeOperations(x, y);

        // print result
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}