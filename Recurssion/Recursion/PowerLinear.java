package Recursion;
import java.util.*;

public class PowerLinear{

    // this method id applicable only for n>0
    public static double myPow(double x , int n)
    {
        if(n == 1) return x;

      
        double f = myPow(x, n-1);
        double ans = x * f;
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       double x = scn.nextDouble();
       int n = scn.nextInt();

        System.out.println(myPow(x, n));    
    }
}