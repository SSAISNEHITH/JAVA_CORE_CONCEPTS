import java.util.*;
public class Shifting_leftShift {
    public static String shiftingLetters(String s,int[]shifts){
        char[]arr=s.toCharArray();
        for(int i=0;i< arr.length;i++){
            int shift=shifts[i]%26;
            arr[i]=(char)((arr[i]-'a'-shift)%26+'a');
        }
        return new String(arr);
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        int n=s.length();
        int[]shifts=new int[n];
        System.out.println("Enter"+n+"shift values:");
        for(int i=0;i<n;i++){
            shifts[i]=sc.nextInt();
        }
        String result = shiftingLetters(s,shifts);
        System.out.println("output:"+result);
    }
}

