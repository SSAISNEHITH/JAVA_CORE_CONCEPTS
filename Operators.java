import java.util.Scanner;
public class Operators {
    static void main(String[] args) {
        int a=5;
        int b=10;
        //Arthematic operator
        System.out.println("----Arthematic Operator----");
        System.out.println("a+b->"+(a+b));
        System.out.println("a-b->"+(a-b));
        System.out.println("a*b->"+(a*b));
        System.out.println("a/b->"+(a/b));
        System.out.println("a%b->"+(a%b));
        //Relational Operators
        System.out.println("----Relational Operators----");
        System.out.println("a<b->"+(a<b));
        System.out.println("a<=b->"+(a<=b));
        System.out.println("a>b->"+(a>b));
        System.out.println("a>=b->"+(a>=b));
        System.out.println("a==b->"+(a==b));
        System.out.println("a!=b->"+(a!=b));
        //Assignment Operators
        System.out.println("----Assignment Operators----");
        System.out.println("For a=a+b => a+=b->"+(a+=b));
        System.out.println("For a=a-b => a-=b->"+(a-=b));
        System.out.println("For a=a*b => a*=b->"+(a*=b));
        System.out.println("For a=a/b => a/=b->"+(a/=b));
        float c;
        System.out.println("For a=a%b => a%=b->"+(c=a%b));
        //Ternary Operators
        System.out.println("Ternary Operators");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter num value->");
        int num=s.nextInt();
        String ans = (num%2==0)? "Even" : "Odd";
        System.out.println(ans);
        //unary operator
        int x=2;
        int y=4;
        System.out.println("---Unary operator---");
        System.out.println("x="+x+"\ty="+y);
        System.out.println("value++-->"+(x++));     //post increment it acts as the given value is used first and then increment is done and stores in the variable(value)
        System.out.println("++value-->"+(++x));     //pre increment the values is incremented first and then used also stores in the variable(value)
        System.out.println("value-- ==>"+(y--));    // post decrement
        System.out.println("--value==>"+(--y));     //pre decrement
        //logical operator
        System.out.println("---logical Operator---");
        System.out.println("&&-->"+((x>y)&&(a>b)));
        System.out.println("||-->"+((x>y)||(a>b)));
    }
}
