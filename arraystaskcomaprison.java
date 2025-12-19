import java.util.Scanner;
public class arraystaskcomaprison {
        static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int size1,size2;
            System.out.println("Enter size of first array->");
            size1=s.nextInt();
            int[] arr1 = new int[size1];
            System.out.println("Enter size of the second array->");
            size2=s.nextInt();
            int[] arr2 = new int[size2];
            int i,j;
            for(i=0;i<size1;i++){
                System.out.println("Enter the element of array 1 with index"+i+"->");
                arr1[i]=s.nextInt();
            }
            for(j=0;j<size2;j++){
                System.out.println("Enter the element of array 2 with index"+j+"->");
                arr2[j]=s.nextInt();
            }
            int size3=1;
            if(size1<size2){
                size3=size1;
            }else {
                size3=size2;
            }
            int[] arr3=new int[size3];
            for(i=0;i<size1;i++){
                for(j=0;j<size2;j++){
                    if(arr1[i]==arr2[j]){
                        System.out.print(arr1[i]+" ");
                        }
                    }
                }

           }


}

