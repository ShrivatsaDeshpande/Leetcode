class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int total_product = 1;
        int c = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)c++;
        }
        if(c == 1){
            for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)continue;
            total_product *= nums[i];
        }
         for(int i = 0; i< nums.length;i++){
            if(nums[i] == 0)
            nums[i] = total_product;
            else nums[i] = 0;
        }
        }
        else if(c > 1){
            for(int i = 0; i < nums.length; i++){
            nums[i] = 0;
        }}
        else {
            for(int i = 0; i < nums.length; i++){
            total_product *= nums[i];
        }
        for(int i = 0; i< nums.length;i++){
            nums[i] = total_product/nums[i];
        }
        }

        return nums;
    }
}