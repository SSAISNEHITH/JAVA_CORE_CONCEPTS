public class datatypes {
    public static void main(String[] args) {
        // Primitive datatypes
        byte b = 23;
        System.out.println(b);

        short s = 30000;
        System.out.println(s);

        int id = 2;
        System.out.println(id);

        long l = 34000L;
        System.out.println(l);

        float f = 23.45f;
        System.out.println(f);

        double d = 23.5443;
        System.out.println(d);

        char c = 'e';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        // Non-Primitive datatypes
        String str = "Sequence of characters";
        System.out.println(str);

        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<5;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

