package Recursion;
import java.util.Scanner;

public class LastOccurance {

    // if the input index is last index
    public static int lastOccur_1(int[] A , int idx , int N)
    {
        if(idx < 0) return -1;

        if(A[idx] == N) return idx;

        else{
            int lastIdx = lastOccur_1(A, idx-1, N);
            return lastIdx;
        }
    }

    // if the input index is 0
    public static int lastOccur_2(int[] A, int idx , int N)
    {
        if(idx == A.length) return -1;

        int lastOccur = lastOccur_2(A, idx+1, N);

        if(lastOccur == -1)
        {
            if(A[idx] == N)
            {
                return idx;
            }
            
            else{
                return -1;
            }
        }

        else{
            return lastOccur;
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
        System.out.println(lastOccur_1(A , n-1 , B));
        System.out.println(lastOccur_2(A , 0 , B));
    }
    
}
