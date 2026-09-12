impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut needMap: HashMap<i32,i32> = HashMap::new();

        for i in 0..nums.len() {
            if let Some(&previous_index) = needMap.get(&nums[i]) {return vec![previous_index, i as i32]}

            needMap.insert(target-nums[i], i as i32);
        }
        Vec::new()
    }
}
