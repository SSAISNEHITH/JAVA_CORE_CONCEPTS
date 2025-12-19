import java.util.Scanner;
public class Conditional_Statement_if {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter present condition->");
        String x = s.next();
        if (x.equals("rainny")) {
            System.out.println("Take Umbrella");
        }
    }
}
