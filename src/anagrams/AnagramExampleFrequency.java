package anagrams;

public class AnagramExampleFrequency {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaraka";
        int[] char_count = new int[26];

        if(s.length()!=t.length()) {
            System.out.println("false");
            System.exit(0);
        }
        for(int i=0;i<s.length();i++) {
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }

        for(int j=0;j<char_count.length;j++) {
            if(char_count[j]!=0) {
                System.out.println("false");
                System.exit(0);
            }
        }
        System.out.println("true");
    }
} // Time complexity O(n) with space complexity O(26)
