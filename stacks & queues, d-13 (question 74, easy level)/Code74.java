class Code74 {
    public int firstUniqChar(String s) {
        int[] vec=new int[26];
        for(char c : s.toCharArray() ) vec[c-'a']++;
        for(int i=0;i<s.length();i++) if(vec[s.charAt(i)-'a']==1) return i;
        return -1;
    }
}