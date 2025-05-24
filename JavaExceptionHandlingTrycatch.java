import java.io.*;
import java.util.*;

public class JavaExceptionHandlingTrycatch {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        try{
            int numerator = scan.nextInt();
            int denominator = scan.nextInt();
            System.out.println(numerator/ denominator);
        }catch(InputMismatchException e){
                System.out.println(e.getClass().getName());
        }catch(ArithmeticException e){
                System.out.println(e.toString());
        }
    }
}
