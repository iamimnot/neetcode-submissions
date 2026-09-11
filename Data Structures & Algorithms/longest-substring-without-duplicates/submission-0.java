class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        int i=0,j=0;

        while(i<s.length() && j<s.length()) {
            Set<Character> substring = new HashSet<>();
            for(int k=i; k<=j; k++) {
                if(substring.contains(s.charAt(k))) {
                    while(substring.size()>0 && substring.contains(s.charAt(k))) {
                        substring.remove(s.charAt(i));
                        i++;
                    }
                    break;
                } else {
                    substring.add(s.charAt(k));
                    maxLength = Math.max(substring.size(), maxLength);
                }
                
            }     
            j++;       
        }

        return maxLength;
        
        
    }
}
