import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] ans = s.trim().split("[^A-Za-z]+");
        if(s.trim().isEmpty() || ans.length == 0 || (ans.length == 1 && ans[0].isEmpty())){
            System.out.println(0);
        }else{
            System.out.println(ans.length);
            for(String a: ans){
                System.out.println(a);
            }
        }
        scan.close();
    }
}

