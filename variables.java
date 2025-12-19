import java.util.*;
public class variables {
    static int values=2;
        int result=0;
    public void add() {
        int a = 10;
        int b = 20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        result = a + b;
    }
    public void display(){
        System.out.println("no of values="+values);
        System.out.println("result="+result);
    }

    public static void main(String[] args) {
        variables v=new variables();
        v.add();
        v.display();
    }
}

