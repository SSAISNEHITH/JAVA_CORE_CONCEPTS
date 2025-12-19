import java.util.Scanner;

public class arrays_count_of_even_num {
    static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array->");
        int size=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the array value with indes"+ i+"->");
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                count++;
                continue;
            }
        }
        System.out.println("NO.Of EVen numbers->"+count);
    }
}
