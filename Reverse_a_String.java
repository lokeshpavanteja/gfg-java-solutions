import java.util.Scanner;
public class Reverse_a_String{
    public static String revStr(String s){

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a string:");
        s = sc.nextLine();

        String reversed = revStr(s);
        System.out.print("reversed string is :"+reversed);

    }
}