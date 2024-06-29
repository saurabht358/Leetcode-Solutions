class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        String str= String.valueOf(x);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(str)){
                ans.add(i);
            }
        }
        return ans;
    }
}
