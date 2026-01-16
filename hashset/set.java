package hashset;
import java.util.HashSet;
import java.util.Scanner;
public class set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashSet<Integer> set= new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }
    
}
