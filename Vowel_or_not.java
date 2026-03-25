import java.util.*;

class Solution {
    String isVowel(char c) {
        c = Character.toLowerCase(c);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "YES";
        } else {
            return "NO";
        }
    }
}

public class Vowel_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        Solution obj = new Solution();
        System.out.println(obj.isVowel(c));
    }
}