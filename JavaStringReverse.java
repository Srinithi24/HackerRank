import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = new StringBuilder(A).reverse().toString();
        if (A.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}



