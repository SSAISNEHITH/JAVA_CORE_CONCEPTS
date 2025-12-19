import java.util.Scanner;
public class Conditional_Statement_Switch {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.January" + "\n2.February" + "\n3.March" + "\n4.April" + "\n5.May" + "\n6.June" + "\n7.July" + "\n8.August" + "\n9.September" + "\n10.October" + "\n11.November" + "\n12.December");
        System.out.println("Enter the month->");
        int month = s.nextInt();
        switch (month) {
            case 0:
                s.close();
                break;
            case 1:
                System.out.print("31 Days");
                break;
            case 2:
                System.out.print("28 Days");
                break;
            case 3:
                System.out.print("31 Days");
                break;
            case 4:
                System.out.print("30 Days");
                break;
            case 5:
                System.out.print("31 Days");
                break;
            case 6:
                System.out.print("30 Days");
                break;
            case 7:
                System.out.print("31 Days");
                break;
            case 8:
                System.out.print("31 Days");
                break;
            case 9:
                System.out.print("30 Days");
                break;
            case 10:
                System.out.print("31 Days");
                break;
            case 11:
                System.out.print("30 Days");
                break;
            case 12:
                System.out.print("31 Days");
                break;
            default:
                System.out.println("please enter number between 0 and 12");

        }
    }
}