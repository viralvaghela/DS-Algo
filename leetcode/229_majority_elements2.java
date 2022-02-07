/*

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // naive solution = T(n^2)
        // ArrayList<Integer> ans = new ArrayList();
        // for(int i = 0;i<nums.length;i++)
        // {
        // int count = 1;
        // for(int j = i+1;j<nums.length;j++)

        // {
        // if(nums[i]==nums[j])
        // count++;
        // }

        // if(count>nums.length/3)
        // if(!ans.contains(nums[i]))
        // ans.add(nums[i]);

        // }
        // return ans;

        // }

        ArrayList<Integer> ans = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap();

        for (int num : nums) {
            if (!map.containsKey(num))
                map.put(num, 1);
            else
                map.put(num, map.get(num) + 1);

            if (map.get(num) > nums.length / 3 && !ans.contains(num))
                ans.add(num);
        }

        return ans;
    }
}