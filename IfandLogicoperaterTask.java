import java.util.Scanner;

public class IfandLogicoperaterTask {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age->");
        int age=s.nextInt();
        System.out.println("Enter your Citizenship->");
        String Citi=s.next();
        if((age>=18)&&(Citi.equals("Indian"))){
            System.out.println("major and Citizen of India");
        }
        else{
            System.out.println("not a Citizen of India");
        }
    }
}
