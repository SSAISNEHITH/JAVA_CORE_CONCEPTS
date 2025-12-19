import java.util.Scanner;

class task{
    static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum=0;
        int num;
        do{
            System.out.println("Enter random values");
            num=s.nextInt();
            sum= sum + num;
        }while( num > 0);
        System.out.println("sum->"+sum);
    }
}