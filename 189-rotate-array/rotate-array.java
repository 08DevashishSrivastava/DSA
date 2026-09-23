class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if( k == 0){
            return ;
        }
        k = k % n;
        // int reverse = int[i] & int[j];
        // while(i < j){
        //     swap(nums[i] , nums[j]);
            // i++;
            // j--;
        
     reverse(nums,0 , n-1);
     reverse(nums,0 , k-1);
     reverse(nums,k , n-1);
    
}
public void  reverse(int [] nums , int i , int  j ){
      while( i < j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
      }
}
}