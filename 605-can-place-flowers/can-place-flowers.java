class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       if(n == 0){ return true; }
        
        for(int  i = 0 ; i < flowerbed.length ; i++){
           if( flowerbed[i] == 0){
           int leftside = (i == 0) ? 0 : flowerbed[i - 1];
          
int rightside = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
                         if(leftside == 0 && rightside == 0){
                 flowerbed[i] = 1;
                 n--;
                 if(n == 0 ){
                    return true;
                 }
              }
           }
        }
        return false;
    }
}