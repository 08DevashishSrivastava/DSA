//  this is done by counting sort in best approch 

//  i am not able to solve this 

class Solution {
    public int heightChecker(int[] heights) {
      int expected [] = heights.clone();
      Arrays.sort(expected);
    //   count.sort(expected);
      int count  = 0 ;
      for(int i = 0 ;i < expected.length ; i++){
        if(expected[i] != heights[i]){
            count++;
        }
      }
      return count;
    }
}