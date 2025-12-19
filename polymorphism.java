public class polymorphism {
    static class poly{
        void display(){
            System.out.println("I am  POLYMORPHISM TOPIC");
        }
        void display(int a){
            System.out.println(a);
        }
        void display(int a, int b){
            System.out.println((a+b));
        }
    }

    static void main(String[] args) {
        poly o=new poly();
        o.display();
        o.display(100);
        o.display(2,3);

    }
}
