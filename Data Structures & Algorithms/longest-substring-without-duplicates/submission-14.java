class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        int i=0,j=0;
            Set<Character> substring = new HashSet<>();

        while(i<s.length() && j<s.length()) {
            
                
                    while(substring.contains(s.charAt(j))) {
                        substring.remove(s.charAt(i));
                        i++;
                    }
                    
               
                    substring.add(s.charAt(j));
                    maxLength = Math.max(substring.size(), maxLength);
                    j++;
                
                
                 
                   
        }

        return maxLength;
        
        
    }
}
