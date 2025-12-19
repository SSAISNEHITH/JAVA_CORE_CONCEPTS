import java.util.Scanner;
public class variable_scanner_conversion_task3 {
    static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a value->");
        a=s.nextInt();
        System.out.println("Enter b value->");
        b=s.nextInt();;
        System.out.println("Enter c value->");
        c=s.nextInt();
        int d= (a*b*c);
        int e=(a+b+c);
        float f= (float)d/e;
        System.out.println("Integer values \nA="+a+"\tB="+b+"\tC="+c+"\nMultiply of Integer->"+d+"\nSum of Integers->"+e+"\nDivision of MUltiple&Sum->"+f);
    }
}
