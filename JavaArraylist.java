import java.io.*;
import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> data =new ArrayList<>();
        for(int i=0; i<n; i++){
            int val = scanner.nextInt();
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<val; j++){
                row.add(scanner.nextInt());
            }
            data.add(row);
        }
        int q = scanner.nextInt();
        for(int i=0; i<q; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try{
                System.out.println(data.get(x-1).get(y-1));
            }catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
         
    }
}
