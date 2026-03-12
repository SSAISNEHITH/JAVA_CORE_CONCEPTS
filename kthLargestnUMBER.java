import java.util.PriorityQueue;

public class kthLargestnUMBER {
    static void main(String[] args) {
        int[] arr={1,3,24,34,23};
        int k=3;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num:arr){
            heap.add(num);
            if(heap.size() > k)
                heap.poll();
        }
        System.out.println("Kth Largest:"+heap.peek());
    }
}
