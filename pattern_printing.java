public class pattern_printing {
    static void main(String[] args) {
        int line;
        /*to print the pattern
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        for (line = 1; line <= 5; line++) {
            for (int time = 1; time <= line; time++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        //printing a solid square
        /*
         * * *
         * * *
         * * *
        */
        System.out.println("A Solid Square->");
        int n=3;
        for(int nline=1;nline<=n;nline++){
            for(int i=1;i<=n;i++){
            System.out.print("*"+" ");
        } System.out.print("\n");
        }

        //3.Print a right-aligned right-angled triangle (n=5);
        //4.Print an inverted left-aligned triangle (n=5).
        System.out.println("inverted left-aligned triangle");
        int n3=5;
        for(int line3=5;line3>=1;line3--){
            for(int i3=1;i3<=line3;i3++){
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
        /*Q5. Print a pyramid of * (n=5).**
            *
           ***
          *****
         *******
        *********
        */
        int n5=5;
        System.out.println("pyramid of *");
        for (int i5 = 0; i5 < n5; i5++) {
            for (int j5 = 0; j5 < n5 - i5 - 1; j5++) {
                System.out.print(" ");
            }
            for (int k5 = 0; k5 < 2 * i5 + 1; k5++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}