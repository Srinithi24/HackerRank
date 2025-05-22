import java.io.*;
import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int count= 0;
        for(int start =0; start <n; start++){
            int sum = 0;
            for(int end = start; end<n; end++){
                sum += arr[end];
                if(sum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
