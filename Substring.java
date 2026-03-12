public class Substring {
    static void main(String[] args) {
        String s1 = "apple";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                System.out.println(s1.substring(i, j));
                if(s1.substring(i,j).length()==3){
                count++;
                }
            }
        }
        System.out.println("count="+count);
    }
}

