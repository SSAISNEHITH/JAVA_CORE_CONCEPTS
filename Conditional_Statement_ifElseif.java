import java.util.Scanner;
public class Conditional_Statement_ifElseif {
            static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter present condition->");
            String x=s.next();
            if(x.equals("rainy")){
                System.out.println("Take Umbrella");
            }
            else if(x.equals("summer")){
                System.out.println("Put Sunglasses");
            } else if (x.equals("cool")){
                System.out.println("Wear Woolen Clothes");
            } else{
                System.out.println("lets go");
            }
            s.close();
            }
}
