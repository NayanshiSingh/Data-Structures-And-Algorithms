package Recursion;
import java.util.Scanner;

public class FirstOccurance {

    //less optimised
    public static int firstOccur_1(int[] A , int idx , int B)
    {
        if(idx == A.length) return -1;

        int firstIdx = firstOccur_1(A , idx+1 , B);

        if(A[idx] == B)
        {
            return idx;
        }
        else
        {
            return firstIdx;
        }
    }
    //optimised
    public static int firstOccur_2(int[] A , int idx , int B)
    {
        if(idx == A.length) return -1;

        if(A[idx] == B)
        {
            return idx;
        }
        else
        {
            int firstIdx = firstOccur_2(A , idx+1 , B);
            return firstIdx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int B = sc.nextInt();
        int A[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println(firstOccur_2(A , 0 , B));
    }

}
