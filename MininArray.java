import java.util.Scanner;
public class MininArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter comma seperated integers:");
        String input=sc.nextLine();
        String[] strArr=input.split(",");
        int[] arr=new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            arr[i]=Integer.parseInt(strArr[i].trim());
        }
        System.out.println("Minimum element:"+findmin(arr));
        System.out.println("Max:"+findmax(arr));
        System.out.println("Total:"+findtotal(arr));
        System.out.println("Average:"+findavg(arr));
    }
    public static int findmin(int[] arr){
        int min=arr[0];
        for(int num:arr){if(num<min)min=num;}
        return min;
    }
    public static int findmax(int[] arr){
        int max=arr[0];
        for(int num:arr){if(num>max)max=num;}
        return max;
    }
    public static int findtotal(int[] arr){
        int total=0;
        for(int num:arr){total=total+num;}
        return total;
    }
    public static float findavg(int[] arr){
        float avg=(float) findtotal(arr) / arr.length;
        return avg;
    }
}
