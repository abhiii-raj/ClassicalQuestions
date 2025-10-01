public class MissingNumber {

    public static int missingNumber(int nums[]){
        int n_xor = nums.length;
        
        for(int i = 0; i<nums.length ;i++){
            n_xor = n_xor ^ i;
            n_xor = n_xor ^ nums[i];
        }
        return n_xor;
    }
    public static void main(String args[]){
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));

    }
}
