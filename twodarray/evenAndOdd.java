package twodarray;

import java.util.*;
public class evenAndOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
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
        HashSet<Integer> set= new HashSet<>();
        System.out.println("Even numbers:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]%2==0) {
                    set.add(arr[i][j]);
                    
                }
                
                }
            }
            System.out.println(set);
            HashSet<Integer> secset= new HashSet<>();
             System.out.println("\nodd numbers:");
                for (int i = 0; i < row; i++) {
                   for (int j = 0; j < col; j++) {
                if(arr[i][j]%2!=0) {
                    secset.add(arr[i][j]);
                }
                
            }


            }
            System.out.println(secset);
            
            
        }
        



        
    }
    

