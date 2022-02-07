class Solution {
    
    //naive solution... 
//     public int majorityElement(int[] nums) {
        
//         int ans = 0;
//         for(int i = 0;i<nums.length;i++)
//         {
//             int count = 1;
//             for(int j = i+1;j<nums.length;j++)
            
//             {
//                 if(nums[i]==nums[j])
//                     count++;
//             }

//             if(count>nums.length/2)
//                 return nums[i];
            
//         }
//         return ans;
       
//     }
    
    
    //now lets try using hashmap which will take O(logn)
    
     public int majorityElement(int[] nums) {
         ArrayList<Integer> ans = new ArrayList();
         HashMap<Integer,Integer> map = new HashMap();
         
         for(int num : nums)
         {
             if(!map.containsKey(num))
                 map.put(num,1);
             else
                 map.put(num,map.get(num)+1);
             
             if(map.get(num)>nums.length/2 && !ans.contains(num))
                 ans.add(num);
         }
               
         return ans.get(0);
     }
    
}