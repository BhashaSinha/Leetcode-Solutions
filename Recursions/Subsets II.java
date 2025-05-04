**************************************************RECURSION MANTRA /DO SOMETHING/EXPLORE/BACKTRACK********************************************************************
class Solution {  
    Set<List<Integer>>result=new HashSet<>();      //Use a set result so that it containns only unique 

    public void solve(int i,List<Integer>subSet,int[] nums){
        if(i==nums.length){
           result.add(new ArrayList<>(subSet));
                return;
 }
            
            subSet.add(nums[i]);              // accept
            solve(i+1,subSet,nums);           //explore
           
           
            subSet.remove(subSet.size()-1);      //backtrack

            solve(i+1,subSet,nums);              // dont accept and explore the next one. againn the next one will have 2 choices.
}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(0,new ArrayList<>(),nums);
        return new ArrayList<>(result);   //at the end convert the set to list
    }
}
