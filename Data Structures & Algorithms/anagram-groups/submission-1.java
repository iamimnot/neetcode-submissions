class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];

            char[] chars = s.toCharArray();

            Arrays.sort(chars);

            String sorted = new String(chars);

            if(result.containsKey(sorted)) {
                result.get(sorted).add(s);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);

                result.put(sorted, newGroup);
            }
            
        }
        return new ArrayList<>(result.values());


    }
}
