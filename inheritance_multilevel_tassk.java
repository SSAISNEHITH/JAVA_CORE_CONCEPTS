public class inheritance_multilevel_tassk {
    /*Develop a Java program for a wildlife simulation system using multilevel inheritance, where Animal is the base
    class, Mammal extends it, and Dog extends Mammal. This chain demonstrates how Dog inherits traits from both
    grandparents and parents, modeling real-world biological hierarchies
     */
    static class Animal{
        void animal(){
            System.out.println("Hunting & Eat");
        }
    }static class mamma1 extends Animal{
        void Mamals(){
            System.out.println("Kangarpoo,HipoPotamus");
        }
    }static class dog extends mamma1{
        void sound(){
            System.out.println("Barks");
        }
    }

    static void main(String[] args) {
        mamma1 o1=new mamma1();
        dog o2=new dog();
        System.out.println("multi level inheritence");
        o1.Mamals();
        o1.animal();
        o2.sound();
        o2.animal();
        o2.Mamals();
    }
}
