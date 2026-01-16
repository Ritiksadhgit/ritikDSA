package ifelse;
import java.util.*;

public class conditional5 {
   
    int printPosition(int n) {
         int m= n%8;
        if(m==1) {
    return 1;
        }
        if(m==2) {
    return 2;
        }
        if(m==3) {
    return 3;
        }
        if(m==4) {
    return 4;
        }
        if(m==5) {
    return 5;
        }
        if(m==6) {
    return 4;
        }
        if(m==7) {
    return 3;
        }
        else {
        return 2;
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    conditional5 obj=new conditional5();
   int p= obj.printPosition(n);
    System.out.println(p);
   
}
    
}
