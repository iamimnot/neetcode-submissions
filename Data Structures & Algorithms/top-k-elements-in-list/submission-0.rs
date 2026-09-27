impl Solution {
    pub fn top_k_frequent(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut freq: HashMap <i32, usize>  = HashMap::new();

        for num in &nums {
            if freq.contains_key(num) {
                let count = freq.get_mut(num).unwrap();
                *count += 1;
            } else {
                freq.insert(*num, 1);
            }
        }
        let mut buckets: Vec<Vec<i32>> = vec![Vec::new(); nums.len() + 1];

        for (num, count) in freq {
            buckets[count].push(num);
        }

        let mut result: Vec<i32> = Vec::new();

        let mut i = nums.len()+1;

        while i>0 {
            i-=1;

            for num in &buckets[i] {
                result.push(*num);

                if result.len() == k as usize {
                    return result;
                }

            }
        }
        result
        
        }
}
