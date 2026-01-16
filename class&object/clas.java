import java.util.*;
public class clas {
    String name;
    int age;
    int cls;
    void display() {
        System.out.println("Name:"+name + "age:"+age + "Class"+cls);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        int cls=sc.nextInt();
        clas s1=new clas();
        s1.name=name;
        s1.age=age;
        s1.cls=cls;
        s1.display();
        
                
            
        }
    }


