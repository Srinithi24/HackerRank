import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale usFormat = Locale.US;
        NumberFormat us = NumberFormat.getCurrencyInstance(usFormat);
        Locale inForamt = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(inForamt);
        Locale chFormat = Locale.CHINA;
        NumberFormat china = NumberFormat.getCurrencyInstance(chFormat);
        Locale frFormat = Locale.FRANCE;
        NumberFormat france = NumberFormat.getCurrencyInstance(frFormat);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
