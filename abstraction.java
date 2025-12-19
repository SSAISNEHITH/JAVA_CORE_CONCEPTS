public class abstraction {
    abstract static class nexon {
    abstract void wheels();
    abstract void ac_control();
    }
    static  class nexonbase extends nexon{
        void ac_control(){
            System.out.println("manual ac control");
        }
        void wheels(){
            System.out.println("steel");
        }
    }
    static class nexontop extends nexon{
        void ac_control(){
            System.out.println("automatic ac control");
        }
        void wheels(){
            System.out.println("alloy");
        }

    }

    static void main(String[] args) {
        nexonbase o=new nexonbase();
        nexontop o1=new nexontop();
        System.out.println("NEXON BASE MODEL");
        o.ac_control();
        o.wheels();
        System.out.println("NEXON TOP MODEL");
        o1.wheels();
        o1.ac_control();
    }
}
