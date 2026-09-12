impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        
        let mut freq = [0; 26];

        for i in s.bytes() {
            freq[(i - b'a') as usize] += 1; 
        }

        for i in t.bytes() {
            freq[(i - b'a') as usize] -= 1
        }

        freq.iter().all(|&count| count==0)


    }
}
