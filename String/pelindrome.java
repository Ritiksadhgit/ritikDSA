package String;

import java.util.Scanner;

public class pelindrome {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         String rev="";
         for(int i=str.length()-1;i>=0;i--) {
            rev+=str.charAt(i);
         }
         if(rev.equals(str)) {
            System.out.println("pelindrom");
         }
         else {
            System.out.println("not pelindrom");
         }
    }

    
    
}
