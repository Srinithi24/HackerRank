import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(scan.nextInt());
        }
        int queries = scan.nextInt();
        for(int i=0; i<queries; i++){
            String q = scan.next();
            if(q.equals("Insert")){
                list.add(scan.nextInt(), scan.nextInt());
            }
            if(q.equals("Delete")){
                list.remove(scan.nextInt());
            }
            
        }
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
