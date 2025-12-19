import java.util.Scanner;
public class Exception_try_catch_finally {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter numerator->");
            int num=s.nextInt();
            System.out.println("Enter denominator->");
            int den=s.nextInt();
            System.out.println(num/den);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        //Geniric catch block
        catch (Exception e1){
            e1.printStackTrace();
        }
        //finally used to close the resources
        finally {
            s.close();

        }
    }
}
