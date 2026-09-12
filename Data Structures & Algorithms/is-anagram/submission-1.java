class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charMap = new int[26];

        for(int i=0; i<s.length(); i++) {
            charMap[s.charAt(i)-'a'] += 1;
        }

        for(int i=0; i<t.length(); i++) {
            charMap[t.charAt(i)-'a'] -= 1;
        }

        for(int i=0; i<26; i++) {
            if(charMap[i]!=0) return false;
        }
        return true;
    }
}
