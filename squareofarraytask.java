import java.util.Scanner;
public class squareofarraytask {
    static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter siz of the array->");
        int n=s.nextInt();
        int[] square=new int[n];
        for(int i=0;i<n;i++){
            square[i]=s.nextInt();
        }
        System.out.println("Square from 1 to "+n+":");
        for(int sq :square) {
        int squ=sq*sq;
            System.out.print(squ +" ");
        }
    }
}