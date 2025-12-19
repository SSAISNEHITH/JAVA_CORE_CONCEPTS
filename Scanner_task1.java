import java.util.*;
public class Scanner_task1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name->");
        String name=s.nextLine();
        System.out.println("Enter age->");
        int age=s.nextInt();
        System.out.println("Name="+name+"\nAge="+age);
    }
}
