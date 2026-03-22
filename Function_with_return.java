import java.util.*;

public class Function_with_return {
    public static int returnValueFunction(int n) {
        return n * 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        System.out.print("The double of " + n + " is : ");
        System.out.println(returnValueFunction(n));
    }
}
