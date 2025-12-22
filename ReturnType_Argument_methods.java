public class ReturnType_Argument_methods {
        static void method()
        {
            System.out.println("without return type abd without argument");
        }
        static void method1(int i,int j){
            int z=i+j;
            System.out.println(z);
        }
        static int m3(){
            int i=5;
            int j=4;
            int y=(i*j);
            return y;
        }
        static int m4(int a, int b){
            int c =a%b;
            return c;
        }
        public static void main(String[] args){
            ReturnType_Argument_methods obj=new ReturnType_Argument_methods();
            method();
            method1(1,2);
            System.out.println(m3());
            System.out.println(m4(5,6));

        }
    }

