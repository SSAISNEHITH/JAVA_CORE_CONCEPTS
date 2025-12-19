import java.util.*;
public class variablestask4 {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Name->");
        String name=s.nextLine();
        System.out.println("Enter Your score for 100->");
        float scor =s.nextFloat();
        System.out.println("Enter your Department_>");
        String dep=s.next();
        float score=(scor/10);
        System.out.println("Name->"+name);
        System.out.println("Score for 100->"+scor);
        System.out.println("Department->"+dep);
        System.out.println("Score for 10->"+score);

    }
}
