import java.io.*;
import java.util.*;

public class JavaGenerics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArray = {1,2,3};
        String[] strArray = {"Hello", "World"};
        printArray(intArray);
        printArray(strArray);
    }
    public static <T> void printArray(T[] arr){
            for(T val : arr){
                System.out.println(val);
            }
        }
}
