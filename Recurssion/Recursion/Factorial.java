package Recursion;
import java.util.Scanner;

public class Factorial {

    public static int nFactorial(int n )
    {

        if(n == 1) return 1;

        int f1 = nFactorial(n-1);
        int ans = n * f1;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = n;
        System.out.println(nFactorial(n));

      
    }

    
}
