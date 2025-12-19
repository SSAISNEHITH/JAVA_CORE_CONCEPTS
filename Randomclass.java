import java.util.Random;

public class Randomclass {
    static void main(String[] args) {
        Random r=new Random();
        int newnum=0;
        while(newnum!=5){
            newnum=r.nextInt(11);
            System.out.println(newnum);
        }
    }
}
