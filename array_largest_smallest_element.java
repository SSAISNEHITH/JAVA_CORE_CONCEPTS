import java.util.Scanner;

public class array_largest_smallest_element {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array-->");
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter "+i+"index element of the array-->");
            arr[i]=s.nextInt();
        }
        int largest_num=arr[0];
        for(int i=1;i<size;i++){
            if(largest_num<arr[i]){
                largest_num=arr[i];
                continue;
            }
        }
        System.out.println("largest number->"+largest_num);
        int smallest_num=arr[0];
        for(int i=1;i>size;i++){
            if(smallest_num<arr[i]){
                smallest_num=arr[i];
                continue;
            }
        }
        System.out.println("smallest number->"+smallest_num);

    }
}
