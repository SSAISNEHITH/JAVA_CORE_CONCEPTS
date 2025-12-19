public class overloading {
    public static void display(int a, int b){
        System.out.println("Integers-->"+(a+b));
    }
    public static void display(String s){
        System.out.println("String-->"+s);
    }

    static void main(String[] args) {
        display(5,6);              // calls the first function
        display("hello welcome");     //calls the second function
    }
}
