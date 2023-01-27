package anagrams;

import java.util.HashMap;
import java.util.Iterator;

public class AnagramExampleHashMap {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        HashMap map = new HashMap();
        for(int i=0;i<s.length();i++) {
            if(map.get(s.charAt(i))==null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), (int)map.get(s.charAt(i))+1);
            }
        }

        for(int j=0;j<t.length();j++) {
            if(map.get(t.charAt(j))==null) {
                System.out.println("false");
                System.exit(0);
            } else {
                map.put(t.charAt(j), (int)map.get(t.charAt(j))-1);
            }
        }

        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            if((int)map.get(iterator.next())!=0) {
                System.out.println("false");
                System.exit(0);
            }
        }
        System.out.println("true");
    }
} // Time complexity O(n)
// Space complexity is O(1)
