import java.util.Scanner;
public class string_Rotation_of_other {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String values =");
        String s1 =s.nextLine();
        String s2 =s.nextLine();
        s.close();
        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
