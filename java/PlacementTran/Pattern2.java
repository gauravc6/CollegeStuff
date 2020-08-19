import java.util.Scanner;
/*
        * 
      *   *
    *       * 
  *           *
* * * * * * * * *
*/

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=1; i<=n; i++) {
            for (int k=0; k<n-i;k++) {
                System.out.print("  ");
            }
            for (int j=0; j<2*i-1; j++) {
                if(j==0 || j==2*i-2 || i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}