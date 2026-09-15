class Solution {
    public int thirdMax(int[] num) {
        long V1 = Long.MIN_VALUE;
           long V2 = Long.MIN_VALUE;
              long V3 = Long.MIN_VALUE;
      for(int  i = 0 ; i < num.length ; i++){
        if(num[i ] == V1  || num[i] == V2  || num[i] == V3){
            continue;
        }
        if(num[i] > V1){
            V3 = V2;
            V2 = V1 ;
            V1 = num[i];
        }
        else if(num[i] > V2){
            V3 = V2;
            V2 = num[i];
        }
        else if(num[i] > V3){
            V3 = num[i];
        }
      }
        if( V3 == Long.MIN_VALUE){
            return (int)V1;
        }
        else{
            return (int) V3; 
        }
    }
}

//  17/35 testcase pss ho rhe h yhe code me jo upar h 

// class Solution {

//     public int thirdMax(int[] nums) {

//         long V1 = Long.MIN_VALUE;
//         long V2 = Long.MIN_VALUE;
//         long V3 = Long.MIN_VALUE;

//         for (int i = 0; i < nums.length; i++) {

//             if (nums[i] == V1 || nums[i] == V2 || nums[i] == V3) {
//                 continue;
//             }

//             if (nums[i] > V1) {

//                 V3 = V2;
//                 V2 = V1;
//                 V1 = nums[i];

//             } 
//             else if (nums[i] > V2) {

//                 V3 = V2;
//                 V2 = nums[i];

//             } 
//             else if (nums[i] > V3) {

//                 V3 = nums[i];
//             }
//         }

       
//         if (V3 == Long.MIN_VALUE) {
//             return (int)V1;
//         }

//         return (int)V3;
//     }
// }