class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        List<String> ans = new ArrayList<>();
        for (String w : words) {
            if (check(w,pattern)) {
                ans.add(w);
            }
        }
        return ans;
    }

    private boolean check(String word, String pattern) {
        for(int i = 0; i< word.length(); i++){
            if(word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
}
