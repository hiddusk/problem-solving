package reversestring;

// Time: O(n), Space: O(1)
public class ReverseStringExample {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(arr); // O(n) Time complexity and O(1) space complexity
    }
}
