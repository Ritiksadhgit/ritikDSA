package twodarray;
import java.util.*;;
public class sumOFcol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  System.out.println("Enter no. of rows:");
   int row=sc.nextInt();
  System.out.println("Enter no. of columns:");
   int col=sc.nextInt();
   int arr[][]=new int[row][col];

   System.out.println("Enter array elements:");
   for (int i = 0; i < row; i++) {
       for (int j = 0; j < col; j++) {
           arr[i][j]=sc.nextInt();

       }
   }
      for (int j = 0; j < col; j++) {
        int sum=0;
       for (int i = 0; i < row; i++) {
           sum+=arr[i][j];

       }
       System.out.println("Sum of columns:"+j+" "+sum);
   }



    }
}