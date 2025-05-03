
********************************************ALWAYS REMEMBER BEFORE LOOKING AT THE CODE DOSOMETHING/RECURSIONFN/BACKTRACK ****************************************************
class Solution {
    List<List<Integer>>result=new ArrayList<>();

      public void solve(int i, List<Integer>subSet,int[] nums){
            if(i==nums.length){
            result.add(new ArrayList<>(subSet));
            return;
         }
        
         // 2 decisions to take either accept or reject.
          subSet.add(nums[i]);  //accept
          solve(i+1,subSet,nums); //explore (recursion will solve the rest)
         
         //reject(move on to next element)
         //but,we know that we have accepted it earlier so first backtrack and remove the changes.
         subSet.remove(subSet.size()-1);
         solve(i+1,subSet,nums); // again explore as simple use recursion to accept the next one.
      }
        
         public List<List<Integer>> subsets(int[] nums) {
            solve(0,new ArrayList<>(),nums);
            return result;
    }
}  
