import java.util.*;
public class KTHlargestelement {

    public static int kthLargestElement(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        if(k > arr.length){
            return -1;
        }else{
            for(int i=0; i<arr.length; i++){
                pq.add(arr[i]);
                if(pq.size() > k){
                    pq.remove();
                }
            }   
        }
        return pq.remove();
    }
    public static void main(String args[]){
        int arr[] = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(kthLargestElement(arr, k));
    }
}
