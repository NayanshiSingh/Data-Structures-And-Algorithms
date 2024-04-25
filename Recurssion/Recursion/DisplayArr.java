package Recursion;
public class DisplayArr {
    
    static void display(int[] A , int idx)
    {
        if(idx < 0) return;

        display(A, idx-1);
        System.out.println(A[idx]);
    }

    public static void main(String[] args) {

        int[] A = {1,2,3,4,77,45,0,39};
        int size = A.length;

        reverseDisplay(A,size-1);
    }

    static void reverseDisplay(int[] A , int idx)
    {
        if(idx < 0) return;

        System.out.println(A[idx]);
        reverseDisplay(A, idx-1);
    }
}
