import java.util.HashMap;

public class CountSubstringsWithKDistinct {
    
    public static int countSubstringsWithKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        
        return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
    }

    private static int countAtMostKDistinct(String s, int k) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int left = 0, right = 0, count = 0;
        
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
            
            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }
            
            count += right - left + 1;  // count all substrings ending at 'right' with at most k distinct characters
            right++;
        }
        
        return count;
    }

    public static void main(String[] args) {

        String s2 = "aabacbebebe";
        int k2 = 3;
        System.out.println("Output: " + countSubstringsWithKDistinct(s2, k2));
    }
}
