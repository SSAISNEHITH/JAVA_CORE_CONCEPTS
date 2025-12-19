public class Interface {
    interface A{
        void method1();
        void method2();
    }
    static class B implements A{
        public void method1(){
            System.out.println("Method1");
        }public void method2(){
            System.out.println("Method2");
        }
    }
    static void main(String[] args) {
        B obj=new B();
        obj.method1();
        obj.method2();
    }
}
