public class inheritanceexp {
    static class father{
        public void car(){
            System.out.println("HE had a car");
        }
        static class son extends father{

        }

        static void main(String[] args) {
            father obj1=new father();
            son obj2=new son();
            obj2.car();
            obj1.car();
        }
    }
}
