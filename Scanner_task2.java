import java.util.Scanner;
public class Scanner_task2 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name->");
        String name=s.nextLine();
        System.out.println("Enter Age->");
        int age=s.nextInt();
        s.nextLine();
        System.out.println("Enter Address->");
        String add=s.nextLine();
        System.out.println("Enter roll number->");
        String roll =s.next();
        System.out.println("Name="+name+"\nAge="+age+"\nAddress="+add+"\nRoll Number="+roll);
    }
}
