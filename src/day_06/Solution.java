package day_06;


    class Solution {
        public int[] shuffle(int[] nums, int n) {

            int[] newArray = nums;
            for(int i = 0; i < 2*n;i++){
                if(i%2 == 0){
                    newArray[i-1]=nums[i];
                }
            }
            return newArray;
        }
    }

