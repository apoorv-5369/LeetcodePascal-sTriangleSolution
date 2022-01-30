class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ans1 = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans1.add(0,1);
            for(int j=1;j<ans1.size()-1;j++){
             ans1.set(j, ans1.get(j)+ans1.get(j+1));   
            }
            ans.add(new ArrayList<>(ans1));
        }
        return ans;
    }
}
