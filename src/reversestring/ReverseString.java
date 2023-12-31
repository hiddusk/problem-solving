package reversestring;

public class ReverseString {
    public void reverse(String str) {
        if(str.length()==1) {
            System.out.println(str);
        } else {
            System.out.println(str.charAt(str.length()-1));
            reverse(str.substring(0, str.length()-1));
        }
    }
}
