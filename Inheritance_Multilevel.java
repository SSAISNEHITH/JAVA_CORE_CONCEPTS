public class Inheritance_Multilevel {
    interface A{
        void sum();
    }interface B{
        void sub();
    }static class c implements A,B{
        int x=9;
        int y=10;
        public void sum(){
            System.out.println((x+y));
        }public void sub(){
            System.out.println((x-y));
        }
    }
    static void main(String[] args) {
        c obj=new c();
        obj.sum();
        obj.sub();
    }}

