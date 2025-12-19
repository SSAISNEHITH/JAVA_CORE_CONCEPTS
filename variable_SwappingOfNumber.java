public class variable_SwappingOfNumber {
    static void main(String[] args) {
        int num1=10;
        int num2=20;
        int temp=num1;
        System.out.println("before swapping");
        System.out.println("num1="+num1+"\nnum2="+num2);
        num1=num2;
        num2=temp;
        System.out.println("after swapping");
        System.out.println("num1="+num1+"\nnum2="+num2);
    }
}
