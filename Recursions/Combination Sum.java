
*******************************************************RECURSION MANTRA DO SOMMETHING/EXPLORE/ BACKTRACK************************************************************

class Solution {
    List<List<Integer>>result=new ArrayList<>();

    public void solve(int i,List<Integer>subSet, int sum,int[] candidates,int target){
        //this ques has a 3 edge cases so its better that first draw recursion tree and then the edge cases will be clear.
      if(sum==target){
        result.add(new ArrayList<>(subSet));
        return;
      }
      if(sum>target){
        return;
      }
      if(i==candidates.length) return;

      sum+=candidates[i];                   //if accepted ,then add to sum and also to the subset
      subSet.add(candidates[i]);
      solve(i,subSet,sum,candidates,target); //rest all will e done by recursion fn(explore)
        //don't accept  
      sum-=candidates[i];          //backtrack and remove the one you accepted earlier            
      subSet.remove(subSet.size()-1);  // from both subset and sum
      solve(i+1,subSet,sum,candidates,target);   //now explore 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0,new ArrayList<>(),0,candidates,target);
        return result;

    }
}
