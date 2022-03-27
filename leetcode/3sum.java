/*

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
*/

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList();
//         if(nums.length ==0)
//             return result;
        
//         int n = nums.length;
//         for(int i =0;i<n;i++)
//         {
//             for(int j =i+1;j<n;j++)
//             {
//                 for(int k=j+1;k<n;k++)
//                 {
//                     if(nums[i]+nums[j]+nums[k]==0)
//                     {
//                         List < Integer > triplet = new ArrayList < Integer > ();
//                         triplet.add(nums[i]);
//                         triplet.add(nums[j]);
//                         triplet.add(nums[k]);
//                         Collections.sort(triplet);
//                         result.add(triplet);
//                     }
//                 }
//             }
//         }
        
//         result = new ArrayList < List < Integer >> (new LinkedHashSet < List < Integer >> (result));
//         return result;
//     }
// }


class Solution {
    public List < List < Integer >> threeSum(int[] nums) {
        // Sort the given array
        Arrays.sort(nums);

        List < List < Integer >> result = new ArrayList < > ();
        for (int num1Idx = 0; num1Idx + 2 < nums.length; num1Idx++) {
            // Skip all duplicates from left
            // num1Idx>0 ensures this check is made only from 2nd element onwards
            if (num1Idx > 0 && nums[num1Idx] == nums[num1Idx - 1]) {
                continue;
            }

            int num2Idx = num1Idx + 1;
            int num3Idx = nums.length - 1;
            while (num2Idx < num3Idx) {
                int sum = nums[num2Idx] + nums[num3Idx] + nums[num1Idx];
                if (sum == 0) {
                    // Add triplet to result
                    result.add(Arrays.asList(nums[num1Idx], nums[num2Idx], nums[num3Idx]));

                    num3Idx--;

                    // Skip all duplicates from right
                    while (num2Idx < num3Idx && nums[num3Idx] == nums[num3Idx + 1]) num3Idx--;
                } else if (sum > 0) {
                    // Decrement num3Idx to reduce sum value
                    num3Idx--;
                } else {
                    // Increment num2Idx to increase sum value
                    num2Idx++;
                }
            }
        }
        return result;
    }
}