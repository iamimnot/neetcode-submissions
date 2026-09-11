impl Solution {
    pub fn is_palindrome(s: String) -> bool {
        let s1: String = s
        .chars()
        .filter(|c| c.is_ascii_alphanumeric())
        .map(|c| c.to_ascii_lowercase())
        .collect();

        println!("{}",&s1);

        for i in 0..s1.len() {
            if(s1.chars().nth(i) != s1.chars().nth(s1.len()-i-1)) {return false;}
        }
        true
    }
}
