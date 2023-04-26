package longestpalindromesubstring;

/* 1. Use boolean 2D array of String length and Dynamic Programming
*  2. Fill Substring with single char
*  3. Fill Substring with 2 chars
*  4. Substring more than length of 2 i.e 3 onwards which uses 2 for loops so O(n2) is Time Complexity and Space is O(n2)
*/
public class DynamicProgramming {
    public static void main(String[] args) {
        String s = "cbbd";
        int start = 0;
        int maxLength = 0;
        boolean[][] table = new boolean[s.length()][s.length()];

        for(int i=0;i<s.length();i++) {
            table[i][i] = true;
        }

        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i)==s.charAt(i+1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for(int k=3;k<=s.length();k++) {
            for(int i=0;i<s.length()-k+1;i++) {
                int j =i+k-1;
                if(table[i+1][j-1] && s.charAt(i)==s.charAt(j)) {
                    table[i][j]= true;
                    if(k>maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(s.substring(start, start + maxLength));
    }
}
