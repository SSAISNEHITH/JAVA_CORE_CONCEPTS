import java.util.Scanner;
public class String_builders {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I Love Programing");
        System.out.println(sb.length());
        sb.append("Gaming");
        System.out.println(sb);
        sb.insert(18,"and");
        System.out.println(sb);
        sb.replace(2,6,"like");
        sb.replace(2,3,"l");
        System.out.println(sb);
        sb.delete(13,26);
        System.out.println(sb);
        //task to find reverse order of a string

    }
}
