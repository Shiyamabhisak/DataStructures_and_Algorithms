package arrays.hard;

public class SubArrayWithMaxProduct {
    public int maxProductSubArray(int[] nums) {
        int prefix = 1, suffix = 1, maxProduct = Integer.MIN_VALUE, n = nums.length;
        for(int i = 0;i<n;i++){
            if(prefix == 0)prefix = 1;
            if(suffix == 0)suffix = 1;
            prefix *= nums[i];
            suffix *= nums[n-i-1];
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
        }
        return maxProduct;
    }
}
