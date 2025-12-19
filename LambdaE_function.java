import java.util.function.Function;
public class LambdaE_function {
    static void main(String[] args) {
        Function<Integer, Integer> even=n->n*n;
        System.out.println(even.apply(3));
    }
}
/*predicate
function
consume
suoply
*/
//what is the difference b/w function vs consumer vs supplier in java