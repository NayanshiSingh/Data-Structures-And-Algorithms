package Recursion;
import java.util.*;

public class PrintIncDec {

    public static void printInc(int n)
    {   
        if(n == 0) return;

        printInc(n-1);
        System.out.println(n);
    }

    public static void printDec(int n)
    {

        if(n == 0) return ;

        System.out.println(n);
        printDec(n-1);
    }

    public static void printDI(int n)
    {
        if(n == 0) return;

        System.out.println(n);
        printDI(n-1);
        System.out.println(n);
    }

    public static void printID(int n , int s)
    {
        if(s > n) return ;

        System.out.println(s);
        printID(n , s+1);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 1;

        // printInc(n);
        // printDec(n);

        // printDI(n);
        printID(n, s);
    }
}
