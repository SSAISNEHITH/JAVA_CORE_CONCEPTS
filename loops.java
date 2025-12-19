import java.util.Scanner;
public class loops {
        static void main() {
            //for loop
            System.out.println("***for loop***");
            for(int i=1;i<=10;i++) {
                System.out.println(i + "\t" + (11 - i));
            }
            //nested for loop
            System.out.println("***nested for loop***");
            for(int j=1;j<=2;j++){
                for(int k=0;k<=2;k++){
                    System.out.println("sai");
                }
            }
            //for each loop
            System.out.println("***for each loop***");
            int [] arr={2,4,5,6,8,9,7};
            int key=11;
            boolean found=false;
            for(int num:arr){
                if(num == key){
                    found=true;
                    break;
                }
            }

            if(found == true){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            //while loop
            System.out.println("***while loop***");
            int y=1;
            while(y<=20){
                System.out.println(y);
                y++;
            }
            //do_while loop
            System.out.println("***do_while loop***");
            int dw=10;
            do{
                System.out.println(dw);
                dw++;
            }while(dw<=7);
                System.out.println("hello");
            //switch case
            System.out.println("***Switch Case***");
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the Weather Condition->");
            String weather =s.next();
            switch(weather){
                case "rainy":
                    System.out.println("Take Umbrella");
                    break;
                case "summer":
                    System.out.println("wear SunGlasses");
                    break;
                default:
                    System.out.println("lets go");
                    break;

            }
        }
}


