class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        // System.out.println(Arrays.deepToString(intervals));
        int currentMergeLeft = intervals[0][0];
        int currentMergeRightMax = intervals[0][1];

        List<int[]> result = new ArrayList<>();

        for(int[] interval : intervals) {
            if(currentMergeRightMax < interval[0]) {
                result.add(new int[]{currentMergeLeft, currentMergeRightMax});
                currentMergeLeft = interval[0];
                currentMergeRightMax = interval[1];
            }
            
            currentMergeRightMax = Math.max(currentMergeRightMax,interval[1]);
            
        }
        result.add(new int[]{currentMergeLeft, currentMergeRightMax});

        return result.toArray(new int[result.size()][]);
    }
}
