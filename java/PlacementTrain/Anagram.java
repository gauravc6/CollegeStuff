import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        
        for (int i=0; i<a_arr.length; i++) {
            if (a_arr[i] != b_arr[i]) {
                System.out.println("Not anagrams.");
                System.exit(0);
            }
        }
        System.out.println("They are anagrams.");
    }
}