package array;
import java.lang.foreign.SymbolLookup;
import java.util.*;
public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the aray elements;");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse of the array is:");
        for(int i=size-1;i>=0;i--) {
       System.out.print(arr[i]+ " ");
        }
    }
    
}
