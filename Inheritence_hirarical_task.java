public class Inheritence_hirarical_task {
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
    static class car1 extends vehicle {
        void rent(){
            System.out.println("10000");}
        void age_of_car(){
            System.out.println("5 years old");
        }
    }static class car2 extends vehicle{
        void rent(){
            System.out.println("12000");}
        void age_of_car(){
            System.out.println("3 years old");
        }
    }static class car3 extends vehicle{
        void rent(){
            System.out.println("15000");}
        void age_of_car(){
            System.out.println("2 years old");
        }

    static void main(String[] args) {
        car1 c1=new car1();
        c1.company();
        c1.wheels();
        c1.age_of_car();
        c1.no_of_seats();
        c1.rent();
        car2 c2=new car2();
        c2.company();
        c2.wheels();
        c2.age_of_car();
        c2.no_of_seats();
        c2.rent();
        car3 c3=new car3();
        c3.company();
        c3.wheels();
        c3.age_of_car();
        c3.no_of_seats();
        c3.rent();
    }
}
}
