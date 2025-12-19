import java.util.*;
public class persondetails{
    static void main() {
        Scanner scp =new Scanner(System.in);
        System.out.println("Enter name of the person->");
        String name =scp.nextLine();
        System.out.println("Enter age ->");
        int age =scp.nextInt();
        System.out.println("Enter your address->");
        String add =scp.next();
        System.out.println();
        System.out.println("Name-->"+name+ "\nAge-->"+age+ "\nAddress-->"+add);


    }

}