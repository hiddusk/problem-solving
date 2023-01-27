package findbadversion;

public class FindBadVersion {
    public static void main(String[] args) {
        int left=1;
        int right=10;
        while(left<right) {
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)) {
                right=mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left);
    }

    private static boolean isBadVersion(int mid) {
        if (mid==2) {
            return true;
        }
        return false;
    }
}
