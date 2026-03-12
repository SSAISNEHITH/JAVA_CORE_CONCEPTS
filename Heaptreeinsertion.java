import java.util.PriorityQueue;
public class Heaptreeinsertion {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        heap.add(40);
        heap.add(10);
        heap.add(30);
        heap.add(20);
        System.out.println(heap);
        while(!heap.isEmpty()) {
            System.out.println(heap.poll());
        }
    }
}
