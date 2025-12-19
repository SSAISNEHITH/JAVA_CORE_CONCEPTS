public class Exception_ArthematicExceptions_ex {
    static void main(String[] args) {
        System.out.println("***AArthematic Exception***");
        try{
            System.out.println(100/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
