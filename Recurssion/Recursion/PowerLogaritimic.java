package Recursion;
import java.util.Scanner;

public class PowerLogaritimic {
    static int power(int x , int n)
    {
        if(n == 0) return 1;
        
        int f = power(x, n/2);
        int ans = f * f;

        if((n&1) == 1)
        {
            ans = ans*x;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(x, n));
    }

}
