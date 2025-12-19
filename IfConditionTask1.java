import java.util.Scanner;

public class IfConditionTask1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a nummber->");
        int num = s.nextInt();
        if (num == 0) {
            System.out.println("Given number is Zero");
        } else if (num > 0) {
            System.out.println("Given number is positive");
        } else {
            System.out.println("Given Number is negative");
        }
        //task2
        System.out.println("task 2");
        System.out.println("Enter your marks for 100->");
        int marks=s.nextInt();
        if(marks>35){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        //task3
        System.out.println("task 3");
        int incomme;
        System.out.println("Entr income value->");
        incomme=s.nextInt();
        if(incomme<7000){
            System.out.println("Eligible for Scholarship");
        }else{
            System.out.println("Not Eligible for Scholarship");
        }
        //task4
        System.out.println("Task 4");
        System.out.println("Enter a number for division  check");
        int number=s.nextInt();
        if((num%3==0) && (num%5==0)){

                System.out.println("Given number is divisible by 3 & 5");
            }
        else{
                System.out.println("Given number is not divisible by both 3 & 5");
            }
        //task5
        System.out.println("task 5");
        System.out.println("Enter Your 5 subject marks one by one->");
        int q,w,e,r,t;
        q=s.nextInt();
        w=s.nextInt();
        e=s.nextInt();
        r=s.nextInt();
        t=s.nextInt();
        int sumOfmarls=(q+w+e+r+t);
        System.out.println("Total Marks="+sumOfmarls);
        float avg=(sumOfmarls/5);
        if(avg<=35){
            System.out.println("Needed Extra classes");
        }else{
            System.out.println("You can Conntinue");
        }


    }
}
