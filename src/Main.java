import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AN!KET CHAUHAN
 */
public class Main {
    public static void main(String[] args) {

        // Merge two sorted array

        /*
        Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.

        Note: A linear time complexity is expected and you should avoid use of any library function.
        * */

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }

        for(int i = 0; i < m; i++){
            B[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        int c = n + m;
        int[] ans = new int[c];

        int endA = 0;
        int endB = 0;
        int index = 0;

        while (endA < n && endB < m){
            if(A[endA] < B[endB]){
                ans[index] = A[endA];
                index++;
                endA++;
            }else{
                ans[index] = B[endB];
                endB++;
                index++;
            }
        }

        while (endA < n){
            ans[index] = A[endA];
            endA++;
            index++;
        }

        while (endB < m){
            ans[index] = B[endB];
            endB++;
            index++;
        }
        System.out.println(Arrays.toString(ans));
    }
}