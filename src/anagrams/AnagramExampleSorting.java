package anagrams;

import java.util.Arrays;

public class AnagramExampleSorting {
    public static void main(String[] args) {
        System.out.println(validAnagram());
    }

    public static boolean validAnagram() {
        String s = "anagram";
        String t = "nagaram";
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        if (arr1.length!=arr2.length) {
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++) {
            if(arr1[i]!=arr2[i]) {
                return false;
            }
        }
        return true;
    }
    // O(nlogn) is time complexity for sorting
    // O(1) is space complexity
}
