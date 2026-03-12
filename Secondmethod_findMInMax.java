public class Secondmethod_findMInMax {
    static void main(String[] args) {
        int[] arr={10,20,20,5,8};
        int largest =Integer.MIN_VALUE;
        int secondLarget=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLarget = largest;
                largest =num;
            }
            else if(num>secondLarget && num !=largest){
                secondLarget = num;
            }
        }
        if(secondLarget == Integer.MIN_VALUE){
            System.out.println("Seecond largest does not exist");
        }
        else{
            System.out.println("Second Largest:"+secondLarget);
        }
    }
}
