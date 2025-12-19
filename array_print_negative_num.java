import java.util.Scanner;

public class array_print_negative_num {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array->");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter the array value with indes" + i + "->");
            arr[i] = s.nextInt();
        }
        System.out.println("Negative elements are-->");
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
