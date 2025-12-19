public class Exception_NullPointerExceptions_ex {
    static void main(String[] args) {
        System.out.println("***NullPointer Exception***");
        try{
            string str =null;
            System.out.println(str);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
