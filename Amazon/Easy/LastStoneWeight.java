import java.util.*;
public class LastStoneWeight {

    public static int lastStone(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(int x : arr){
            pq.add(x);
        }

        while(pq.size() > 1){
            int x = pq.remove();
            int y = pq.remove();

            if(x != y ) pq.add(x-y);
        }

        if(pq.isEmpty()){
            return 0;
        }
        else{
            return pq.remove();
        }
    }
    public static void main(String args[]){
        int arr[] = {2,7,4,1,8};
        System.out.println(lastStone(arr));
    }
}
