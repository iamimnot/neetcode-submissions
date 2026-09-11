impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {

        let mut unique_nums = HashSet::new();

        for num in nums.iter() {
            if unique_nums.contains(&num) {
                return true;
            }
            unique_nums.insert(num);
        }
        false
    }
}
