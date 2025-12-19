public class Exception_UserExcepttionHandling {
    static void main(String[] args) {
        try {
            int x, y, z;
            x = 10;
            y = 0;
            z = x/y;
            System.out.println(z);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

}
