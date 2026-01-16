package array;
import java.util.*;
public class array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the aray elements;");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
    }  
    int max=Integer.MIN_VALUE;
    int secondmax=Integer.MIN_VALUE;
    for(int i=0;i<size;i++) {
        if(arr[i]>max) {
            secondmax=max;
            max=arr[i];
        }
        else if(arr[i]>secondmax && arr[i]!=max) {
        secondmax=arr[i];
        }
    }
    System.out.println("max:"+ max + "  secondmax:"+ secondmax);
    
    }
}
