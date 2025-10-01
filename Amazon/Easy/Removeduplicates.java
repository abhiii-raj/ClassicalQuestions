public class Removeduplicates {
    public static void main(String args[]){
        int nums[] = {0,1,1,1,2,2,3};
        int i = 0, j = 1;

        while(j < nums.length){
            if(nums[i] < nums[j]){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println((i+=1));
    }
}
