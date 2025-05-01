class Solution {
    
      List<List<Integer>>result=new ArrayList<>();
      Set<Integer>st=new HashSet<>();
      int n;
      public void solve(List<Integer> temp, List<Integer> nums) {
       if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }

    for(int i=0;i<n;i++){
        if(!st.contains(nums.get(i))){
            temp.add(nums.get(i));
            st.add(nums.get(i));

            solve(temp,nums);
            temp.remove(temp.size()-1);
            st.remove(nums.get(i));
        }
    }
}
 public List<List<Integer>> permute(int[] nums)
{
    n=nums.length;
     List<Integer> temp = new ArrayList<>();
        List<Integer> numsList = new ArrayList<>();
         for (int num : nums)
            numsList.add(num);

        solve(temp, numsList);

        return result;
}}
