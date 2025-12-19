public class Inheritance_Singlelevel_task {
    static class vehicle{
        void wheels(){
            System.out.println("Alloy wheels");
        }
        void company(){
            System.out.println("Suzuki");
        }
        void no_of_seats(){
            System.out.println("4");
        }
    }
    static class car1 extends vehicle{
        void rent(){
            System.out.println("10000");}
        void age_of_car(){
            System.out.println("5 years old");
        }
    }

    static void main(String[] args) {
        car1 c=new car1();
        c.company();
        c.wheels();
        c.age_of_car();
        c.no_of_seats();
        c.rent();

    }
}