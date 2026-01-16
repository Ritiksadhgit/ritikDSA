
package ifelse;
import java.util.*;
public class conditional3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c) {
            System.out.println("First number is greatest");

        }
        else if(b>a && b>c) {
            System.out.println("second number is greatest");
        }
        else if(c>a && c>b) {
            System.out.println("Third number is greatest");
        }
    }
    
}
