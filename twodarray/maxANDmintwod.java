package twodarray;
import java.util.*;

public class maxANDmintwod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int row=sc.nextInt();
        System.out.println("Enter cols:");
        int col=sc.nextInt();
        System.out.println("Enter elements:");
        int arr[][]=new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
            
        }
        int max=arr[0][0];
        int min=arr[0][0];
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                if(arr[i][j]>max) {
                    max=arr[i][j];
                }
                if(arr[i][j]<min) {
                    min=arr[i][j];
                }

            }
            
        }
        System.out.println("max element is:"+max);
        System.out.println("min element is:"+min);



        
    }
}
