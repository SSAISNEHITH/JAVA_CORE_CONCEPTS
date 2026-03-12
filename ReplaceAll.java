public class ReplaceAll {
    static void main(String[] args) {
        String str1="hello welcome to vowels world by sai snehith reddy salla";
        String replaced=str1.replaceAll("[aeiouAEIOU]","*");
        System.out.print("String before replaceing="+ str1 + "\nString AAfter Replacing="+replaced);
    }
}
