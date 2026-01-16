package twodarray;
import java.util.*;
public class TwoDArray {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows of array:");
    int rows=sc.nextInt();
    System.out.println("Enter columns of array:");
    int col=sc.nextInt();
    int arr[][]=new int[rows][col];
   
    System.out.println("Enter array elements:");
    for(int i=0;i<rows;i++) {
        for(int j=0;j<col;j++) {
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("your array");
    for(int i=0;i<rows;i++) {
        for(int j=0;j<col;j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}