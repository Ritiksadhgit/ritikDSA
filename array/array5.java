package array;
import java.util.*;
public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int evencount=0;
        int oddcount=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        //even
        System.out.println("Even numbers:");
        for (int i=0;i<size;i++) {
            if(arr[i]%2==0) {
                System.out.println(arr[i]+" ");
                evencount++;             
            }
        }
         System.out.println("Odd numbers:");
            for(int i=0;i<size;i++) {
            if(arr[i]%2!=0) {
                System.out.println(arr[i]+" ");
                oddcount++;
            }
                
            }
            System.out.println( "total Even numbers:"+ evencount);
            System.out.println( "total Odd numbers:"+ oddcount);
        }
        
    }

    
