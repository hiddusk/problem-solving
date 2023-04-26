package longestpalindromesubstring;

/* 1. Check each char with other chars so which comes in 2 for loops O(n2)
*  2. Then check each substring is palindrome or not with additional 3rd for loop so Total Time Complexity O(n3)
*  3. Space Complexity is O(1)
*/
public class BruiteForce {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        int start = 0;
        int maxLength = 0;

        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                int flag = 1;

                for(int k=0;k<(j-i+1)/2;k++)
                    if(s.charAt(i+k)!=s.charAt(j-k))
                        flag = 0;

                if(flag!=0 && j-i+1>maxLength) {
                    start = i;
                    maxLength = j-i+1;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println(s.substring(start, start + maxLength));
    }
}
