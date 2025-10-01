public class SubArraysum {
    public static void main(String args[]){
        int nums[] = {4,-2,-3,4,1};
        int ans = 0;
        for(int i = 0;i<nums.length ;i++){
            int maxVal = nums[i];
            int minVal = nums[i];
            for(int j = i;j<nums.length ;j++){
                minVal = Math.min(minVal, nums[j]);
                maxVal = Math.max(maxVal, nums[j]);
                ans += (maxVal - minVal);
            }
        }

        System.out.println(ans);
    }
}
