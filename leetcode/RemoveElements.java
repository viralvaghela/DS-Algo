/*
https://leetcode.com/problems/remove-element/

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 2.
It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,3,0,0], your answer will be accepted.



*/

 {
    public int removeElement(int[] nums, int val) {
    
        int pos=0;
      for(int i=0;i<nums.length;i++)       {
          if(nums[i]!=val)
          {
              nums[pos]=nums[i];
              pos++;
          }
      }
        return pos;
    }
}



