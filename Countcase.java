public class Countcase {
    static void main(String[] args) {
        String str = "Java Programming 2026 Batch";
        int upper = 0, lower = 0, digit = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
    }
}
