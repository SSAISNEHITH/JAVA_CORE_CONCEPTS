import java.util.Scanner;
public class stringbuilderrtask1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string->");
        String str1 = s.nextLine();
        StringBuilder sb2 = new StringBuilder(str1);
        StringBuilder str2 = sb2.reverse();
        String str3 = str2.toString();
        if (str3.equals(str1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
