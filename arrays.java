import javax.xml.transform.Source;
import java.util.Scanner;

public class arrays {
    //write a java code to get a size of an array from the user and get the values from the user depending on the size of the array and then display the value;
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array->");
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter array element of index"+i+"=");
            arr[i]=s.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0;i<=size;i++) {
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
