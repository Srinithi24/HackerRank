import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        
        a.toLowerCase();
        b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        
        int[] count = new int[26];
        for(int i=0; i<a.length(); i++){
            count[a.charAt(i)-'a']++;
            count[b.charAt(i) - 'a']--; 
        }
        for(int c: count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
