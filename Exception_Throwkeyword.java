public class Exception_Throwkeyword {
    static void main(String[] args) {
        //checked Exception
        int age=16;
        if (age<18){
            throw new ArithmeticException("Age must be more than 18");
        }else {
            System.out.println("Eligible");
        }
    }
}
