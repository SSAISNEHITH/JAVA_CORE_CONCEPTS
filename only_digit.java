import java.util.Scanner;
public class only_digit {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the text:");
        String str = s.nextLine();
        System.out.println("Text=" + str);
        boolean isDigit = str.matches("[0-9]+");
        System.out.println(isDigit);
    }
}
