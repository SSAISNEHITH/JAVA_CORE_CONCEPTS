import java.util.Enumeration;
import java.util.Vector;
public class Cursor_Enumeration {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        Enumeration<Integer> e = v.elements();
        System.out.println("Vector elements:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
