package array;
import java.util.*;
public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter numbers");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<size;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("max number is:"+ max);
        System.out.println("min number is:"+ min);


    }
    
}
