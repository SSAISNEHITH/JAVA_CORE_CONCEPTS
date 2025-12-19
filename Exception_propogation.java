public class Exception_propogation {
    void m1(){
        System.out.println("100/0");
    }void m2(){
        m1();
    }void m3(){
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
