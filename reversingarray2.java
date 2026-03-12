import java.util.Arrays;
import java.util.Scanner;
public class reversingarray2 {
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];arr[j] = temp;
            i++;j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma separated integers:");
        String input = sc.nextLine();
        String[] strArr = input.split(",");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i].trim());
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}