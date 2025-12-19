public class Exception_ThrowsKeyword {
    void m1() throws ArithmeticException{
        System.out.println("100/0");
    }void m2() throws ArithmeticException{
        m1();
    }void m3() throws ArithmeticException{
        m3();
    }

    static void main(String[] args) {
        try{
            Exception_propogation c=new Exception_propogation();
            c.m3();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    }

