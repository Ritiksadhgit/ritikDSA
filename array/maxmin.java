package array;
import java.util.*;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter array elements:");
      
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
      System.out.println("Max is:"+ max + "min is"+ min);
        }
}
