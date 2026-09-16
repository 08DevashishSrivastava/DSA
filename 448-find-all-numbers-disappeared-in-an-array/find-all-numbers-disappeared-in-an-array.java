// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int count  =  0 ; 
//         int nums = 1 ; 
//         int arr[] = new int(arr.length);
//         for(int  i = 0 ; i < nums.length ; i++){
           
//         }
        
//     }
// }

//  nhi a rha h 


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        boolean[] seen = new boolean[nums.length + 1];

        for (int num : nums) {
            seen[num] = true;
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < seen.length; i++) {

            if (!seen[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}