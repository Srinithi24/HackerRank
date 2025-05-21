import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        if(A.substring(0,1). compareTo(B.substring(0,1)) >0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        String space = " ";
        System.out.println(A.substring(0,1).toUpperCase() +A.substring(1) +space+ B.substring(0,1).toUpperCase()+B.substring(1));
    }
    
}



