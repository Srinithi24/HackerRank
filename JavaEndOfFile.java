import java.io.*;
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int lineNum = 1;
        while(scan.hasNext()){
            String line = scan.nextLine();
            System.out.println(lineNum+" "+line);
            lineNum++;
        }
    }
}
 
