package array;
import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];
         //input array
        for (int i=0;i<size;i++) {
            num[i]=sc.nextInt();
            
        } //output array
        for (int i=0;i<size;i++) {
            System.out.println(num[i]);
        }
    }
    
}
