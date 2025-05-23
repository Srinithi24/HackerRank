import java.io.*;
import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int op = scanner.nextInt();
        BitSet b1 = new BitSet(size);
        BitSet b2 = new BitSet(size);
        for(int i=0; i<op; i++){
            String opertaion = scanner.next();
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            BitSet target = (first == 1) ? b1 : b2;
            BitSet other = (first == 1) ? b2 : b1;
            switch(opertaion){
                case "AND":
                    target.and(other);
                    break;
                case "OR":
                    target.or(other);
                    break;
                case "XOR":
                    target.xor(other);
                    break;
                 case "FLIP":
                    target.flip(second);
                    break;
                 case "SET":
                    target.set(second);
                    break;           
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
