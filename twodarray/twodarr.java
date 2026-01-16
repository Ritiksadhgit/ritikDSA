package twodarray;
import java.util.*;
public class twodarr {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size =sc.nextInt();
    int arr[]=new int[size];
    System.out.print("Enter the array elements:");
    for(int i=0;i<size;i++) {
        arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<size;i++) {
        int x=arr[i];
        while(x>=2) {
            x-=2;
        }
       
        if(x==1) {
            System.out.print("odd"+arr[i]+" ");
        }
        
        else {

            System.out.print("even"+ arr[i]+" ");
        }
    }
    
    
    }
    
}
