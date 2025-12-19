public class Exception_ExceptionHandlers {
    static void main(String[] args) {
    try{
        System.out.println("S1");
        System.out.println(10034/0);
        }catch (ArithmeticException e){
        System.out.println(e.getMessage());//print only exception description
        System.out.println(e.toString());//print only name and description of the exception
        e.printStackTrace();//prints name,description,Stacktrace of exception
    }
    }
}
