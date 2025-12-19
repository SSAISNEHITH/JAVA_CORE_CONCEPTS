import javax.xml.transform.Source;
import java.util.Scanner;

public class switchcasetaskes {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1.January"+"\n2.February"+"\n3.March"+"\n4.April"+"\n5.May"+"\n6.June"+"\n7.July"+"\n8.August"+"\n9.September"+"\n10.October"+"\n11.November"+"\n12.December");
        System.out.println("Enter the month->");
        int month=s.nextInt();
        switch (month){
            case 1:
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            case 3:
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("30 Days");
                break;
            case 5:
                System.out.println("31 Days");
                break;
            case 6:
                System.out.println("30 Days");
                break;
            case 7:
                System.out.println("31 Days");
                break;
            case 8:
                System.out.println("31 Days");
                break;
            case 9:
                System.out.println("30 Days");
                break;
            case 10:
                System.out.println("31 Days");
                break;
            case 11:
                System.out.println("30 Days");
                break;
            case 12:
                System.out.println("31 Days");
                break;
            default:
                System.out.println("please enter number between 1 and 12");

        }
        //write a java code to find th given character is given by user it vowels or consonants
        System.out.print("Enter a character: ");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }
        sc.close();
        //code to print no of odd number in range of numbers
        System.out.println("No of odd numbbers betwen 0 and 100");
        int range=0;
        int count=0;
        for(range=1;range<=100;range++){
            if(range%2 !=0){
                count++;
            }
        }
        System.out.println("count->"+count);
        //task
        System.out.println("number divisible by 3 & 5 from 0 to 100");
        int number=1;
        int counts=0;
        for(number=1;number<=100;number++){
            if((number%3==0) && (number%5==0)){
                counts++;
            }
        }
        System.out.println("count="+counts);
    }
}




