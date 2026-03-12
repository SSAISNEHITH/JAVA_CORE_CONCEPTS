import java.util.Scanner;
public class task1CountVowelsConsonants {
    static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        StringBuilder vowel= new StringBuilder();
        StringBuilder consonant=new StringBuilder();
        StringBuilder digit=new StringBuilder();
        System.out.println("Enter a Sentence->");
        String str=s.nextLine();
        str=str.toLowerCase();
        int vowels=0,consonants=0,digits=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch) !=-1){
                vowels++;
                vowel.append(ch);
            } else if ("1234567890".indexOf(ch)!=-1) {
                digits++;
                digit.append(ch);
                digit.append(" ");
            }
            else if(ch >= 'a' && ch <='z'){
                consonants++;
                consonant.append(ch);
            }
        }
        System.out.println("Vowels count="+vowels+"\nVowels in String are->"+vowel);
        System.out.println("Consonants count="+consonants+"\nConsonants in String are->"+consonant);
        System.out.println("Digit count="+digits+"\ndigits in String are->"+digit);
    }
}
