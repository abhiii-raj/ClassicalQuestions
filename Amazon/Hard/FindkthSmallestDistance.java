import java.util.*;

public class FindkthSmallestDistance {

    public static int kthSmallestDistance(int arr[], int k){
        int n = arr.length-1;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(int i = 0;i<n ;i++){
            int val = arr[i];
            for(int j = i+1 ;j<n ;j++){
                int val1 = arr[j];
                int absValue  = Math.abs(val - val1);
                pq.add(absValue);
            }
        }
        
        int count = 0;

        while(!pq.isEmpty()){
            while(count < k){
                pq.remove();
                count++;
            }
            break;
        }
        return pq.remove();
    }
    public static void main(String args[]){
        int arr[] = {1,6,1};
        int k = 3;
        System.out.println(kthSmallestDistance(arr, k));
    }
}
