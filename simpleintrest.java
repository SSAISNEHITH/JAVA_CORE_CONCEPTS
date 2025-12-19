import java.util.Scanner;
public class simpleintrest{
    static void main() {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter amount->");
        int p=sc.nextInt();
        System.out.println("Enter time->");
        double n=sc.nextDouble();
        System.out.println("Enter intrest rate->");
        double r=sc.nextInt();
        double si=(p*n*r)/100;
        System.out.println(si);
    }
}