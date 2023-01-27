package longestsubstringlength;

import java.util.HashMap;
import java.util.Map;

/* We can use window sliding approach we will take 2 pointers i, j
and slide towards right until we find duplicates
This will take Time complexity O(n) and space O(min(m, n)) */
public class LongestSubstring {
    public static void main(String[] args) {
        int i=0; int ans=0;
        Map map = new HashMap<Character, Integer>();
        String s = "abcabcbb";
        for (int j=0;j<s.length();j++) {
            if(map.get(s.charAt(j))!=null) {
                i = Math.max((Integer) map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        System.out.println(ans);
    }
}
