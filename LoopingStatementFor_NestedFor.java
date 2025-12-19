public class LoopingStatementFor_NestedFor {
    static void main(String[] args) {
       System.out.println("***nested for loop***");
        for(int j = 1; j <= 2; j++) {
            for(int k = 0; k <= 2; k++) {
                System.out.print("sai"+" ");
            }
            System.out.print("\n");
        }
    }
}
