import java.util.Scanner;
public class CharFrequencey {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String:");

            String str = sc.nextLine();
            System.out.println("Enter the character:");
            char target = sc.next().charAt(0);

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target)
                {
                    count = count + 1;
                }
            }

            System.out.println("The character count is " + count);

     }
}

