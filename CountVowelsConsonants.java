public class CountVowelsConsonants {
    static void main(String[] args) {
        String str="Java Programming Language";
        int vowels=0,consonants=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch) !=-1){
                vowels++;
            } else if (ch >= 'a' && ch <='z') {
                consonants++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Cononants:"+consonants);
    }
}
