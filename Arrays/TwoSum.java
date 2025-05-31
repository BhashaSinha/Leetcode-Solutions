class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> list=new HashMap<>();   //to store 2 things number it self and its index

        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];           //as there are only two indices e want to find(2 numbers) we dont need a sum variale we can exactly find the cother number through complement. 
            if(list.containsKey(complement)){        // then check if its in th elist of hashmap or not because everything is checked through the hashmap ,if there then return the current index and the complements index
            return new int[] {list.get(complement),i}; 
            }
            list.put(nums[i],i);  //else store in hashmap to check if others can make any sum 
        }
        return new int[0];  //or else returnn 0;
    }
}
