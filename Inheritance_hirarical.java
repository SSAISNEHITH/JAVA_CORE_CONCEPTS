public class Inheritance_hirarical {
    static class animal{
        void eat(){
            System.out.println("Eating");
        }
    }
    static class horse extends animal{
        void race(){
            System.out.println("suitable for racing");
        }
    }
    static class cat extends animal{
        void sound(){
            System.out.println("meow");
        }
    }
    static class ox extends animal{
        void transport(){
            System.out.println("useful for transportation using corts");
        }
    }

    static void main(String[] args) {
        animal o1=new animal();
        horse o2=new horse();
        cat o3=new cat();
        ox o4=new ox();
        o1.eat();
        o2.race();
        o3.sound();
        o4.transport();
        System.out.println("----Hirarical Inheritance----");
        o2.eat();
        o3.eat();
        o4.eat();


    }
}
