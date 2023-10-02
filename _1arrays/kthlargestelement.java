package _1arrays;

class Solution {
    public int findKthLargest(int[] nums, int k) {
      while(k>=0){
          int max = Integer.MIN_VALUE;
          int n =0;
          for(int i = 0; i<nums.length;i++){
             if(nums[i]>max){
                max = nums[i];
                 n= i;
             }
              
          }
          if(k>0){
              k--;
              nums[n] = Integer.MIN_VALUE;
          }
          else{
              return nums[n];
          }
      }
      return -1;
    }
}
public class kthlargestelement
{
	public static void main(String[] args) {
	  int[] arr ={1,2,3,4,5};
	  Solution s = new Solution();
	  System.out.println(s.findKthLargest(arr, 2)); 
	}
}
