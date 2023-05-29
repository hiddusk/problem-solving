package longestsubstringwithkdistinctchars;

import java.util.HashMap;
import java.util.Map;

/*  TimeComplexity: O(n)
**  SpaceComplexity: O(1)
*/
public class LongestSubstring {

    public static void main(String[] args) {
        String s = "aaabbb";
        int k = 3;
        int maxLength = findLongestSubString(s, k);
        System.out.println(maxLength);
    }

    private static int findLongestSubString(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int j=0;
        int maxLength = -1;
        for(int i=0;i<s.length();i++) {
            char input = s.charAt(i);
            map.put(input, map.getOrDefault(input, 0) + 1);
            while(map.size()>k) {
                char key = s.charAt(j);
                map.put(key, map.get(key)-1);

                if(map.get(key)==0) {
                    map.remove(key);
                }
                j++;
            }
            if(map.size()==k) {
                maxLength = Math.max(maxLength, i-j+1);
            }
        }
        return maxLength;
    }
}
