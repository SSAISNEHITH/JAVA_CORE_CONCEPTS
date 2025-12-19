import java.util.Scanner;
public class linearsearchTask {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array=");
        int size = s.nextInt();
        int[] arr = new int[size];
        int i = 0;
        for (i = 0; i < size; i++) {
            System.out.println("Enter " + i + "integer values of array->");
               arr[i] = s.nextInt();
        }
        System.out.println("Enter key value to be searched->");
        int key = s.nextInt();
        boolean found = false;
        for (i = 0; i < size; i++) {
            if (key == arr[i]) {
                System.out.println("key value found at " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Key value not found");
        }else{
            System.out.println("searching is done");
        }
    }
}
