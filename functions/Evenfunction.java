package functions;
import java.util.*;
public class Evenfunction {
void isEven(int number) {
        if(number%2==0) {
            System.out.println("This is Even number");
            
        }
        else {
            System.out.println("This is not even number");
            
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    Evenfunction obj1=new Evenfunction();
    obj1.isEven(number);
    
    
}
    
}
