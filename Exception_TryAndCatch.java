public class Exception_TryAndCatch {
    static void main(String[] args) {
        try{
            System.out.println("S1");
            System.out.println(100/0);//Exception object is created and given to the catch block
            System.out.println("SS");//After the exception object created the rest part code of a try block never executes
        }catch(ArithmeticException e){
            System.out.println("S3");
            System.out.println("S4");
            System.out.println(120/0);//if a exception raised in catch block it is never executed
        }
    }
}
