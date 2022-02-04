import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExp {
    public static void main(String[] args) {
        System.out.println(lastStoneWeightII(new int[]{2,7,4,1,8,1}));
    }



    public static int lastStoneWeightII(int[] stones) {
        PriorityQueue<Integer> weights = new PriorityQueue<>();
        for (int stone : stones) {
            weights.add(-stone);
        }
        while (weights.size() > 1) {
            int stone1 = weights.poll();
            int stone2 = weights.poll();
            int result = -stone1 + stone2;
            if (result > 0){
                weights.add(-result);
            }
        }
        return weights.size() == 0 ? -1 : -weights.poll() ;
    }
}
