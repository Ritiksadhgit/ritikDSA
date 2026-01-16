package array;

import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int ans[]=new int[size];
        int positive=0;
        int negitive=1;
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if(arr[i]>=0) {
                ans[positive]=arr[i];
                positive+=2;
            }
            else {
                ans[negitive]=arr[i];
                negitive+=2;
            }
            
        }
        System.out.print("Final array with sign:");
        for(int x: ans) {
     System.out.print(x +" ");
    }
}
     
    
}
