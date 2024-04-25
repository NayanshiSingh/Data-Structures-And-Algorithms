package Recursion;
import java.util.Scanner;

public class MaxOfArr {
    
    static int maxEle(int[] A , int idx)
    {   
        if(idx == A.length) return A[A.length-1];

        int max = maxEle(A, idx+1);
        if(max < A[idx])
        {
            return A[idx];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] A = new int[size];

        for(int i=0 ; i<size ; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println(maxEle(A, 0));
    }
}
