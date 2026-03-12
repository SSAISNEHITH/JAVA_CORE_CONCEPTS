import java.util.HashMap;
import java.util.PriorityQueue;
public class KthFrequencey {
    public static int[] topKFrequent(int[]nums,int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums) {map.put(num,map.getOrDefault(num,0)+1);}
        PriorityQueue<Integer>heap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int num:map.keySet()) {
            heap.add(num);
            if(heap.size()>k) {heap.poll();}
        }
        int[] result=new int[k];
        int i=0;
        while(!heap.isEmpty()) {result[i++]=heap.poll();}
        return result;
    }
    public static  void main(String[] args) {
        int[] nums= {10,10,10,25,25,3,7,10,7};
        int k=2;
        int[] ans=topKFrequent(nums,k);
        for(int n:ans) {System.out.println(n+"");}
    }

}