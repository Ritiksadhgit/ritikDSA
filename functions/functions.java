package functions;
import java.util.*;
public class functions {
    int printSum(int num1,int num2) {
      return num1+num2;
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int num1=sc.nextInt();
    System.out.println("Enter second number");
    int num2=sc.nextInt();

    functions f1=new functions();
    int x= f1.printSum(num1, num2);
    System.out.println("The sum is:"+ x);
    
    
  }  
}
