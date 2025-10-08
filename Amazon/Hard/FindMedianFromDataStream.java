import java.util.*;

public class FindMedianFromDataStream {
    public static void main(String args[]){
        MedianFinder mf = new MedianFinder();
        mf.add(1);
        mf.add(2);
        System.out.println(mf.findMedian());
        mf.add(3);
        System.out.println(mf.findMedian());
    }
}

class MedianFinder{
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public MedianFinder(){
        maxHeap = new PriorityQueue<>((a,b) -> b-a);
        minHeap = new PriorityQueue<>();
    }

    public void add(int num){
        maxHeap.add(num);
        minHeap.add(maxHeap.remove());
        if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.remove());
        }
    }
    
    public double findMedian(){
        if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        }else{
            return (minHeap.peek() + maxHeap.peek())/2.0d;
        }
    }
}
