import java.util.Scanner;
public class LargestDigitRightIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        String num=sc.next();
        int maxDigit=-1;
        int rightIndex=-1;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(digit>maxDigit){
                maxDigit=digit;
                rightIndex=num.length()-1-i;
            }
        }
        int minDigit=9;
        int leftIndex=-1;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(digit<minDigit){
                minDigit=digit;
                leftIndex=num.length()-i;
            }
        }
        System.out.println("Largest digit is "+maxDigit);
        System.out.println("Index from right(0-based)="+rightIndex);
        System.out.println("Smallest digit is"+minDigit);
        System.out.println("Index from right(0-based)="+leftIndex);
        sc.close();
    }
}