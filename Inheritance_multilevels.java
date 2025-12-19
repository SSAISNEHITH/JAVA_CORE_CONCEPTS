public class Inheritance_multilevels {
    static class animal{
        void eat(){
            System.out.println("Eating");
        }
    }
    static class dod extends animal{
        void barks(){
            System.out.println("BOw BOw");
        }
    }
    static  class cat extends dod{
        void meow(){
            System.out.println("Meow");
        }
    }

    static void main(String[] args) {
        animal ob1=new animal();
        dod obj2=new dod();
        cat obj3=new cat();
        ob1.eat();
        obj2.barks();
        obj3.meow();

        System.out.println("multilevel inheriitance");
        obj2.eat();
        obj3.eat();
        System.out.println("+\n");
        obj3.barks();
        System.out.println("\n");
    }
}
