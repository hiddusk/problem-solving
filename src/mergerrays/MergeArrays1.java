package mergerrays;

public class MergeArrays1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] N = {2,5,6};
        int[] result = new int[6];

        int i=0;int j=0;int k = 0;
        while(k<arr.length) {
            if(i<N.length && arr[i]<N[j] || j==N.length) {
                result[k]=arr[i];
                i++;
                k++;
            } else {
                result[k]=N[j];
                j++;
                k++;
            }
        }
        System.out.println(result);
    }
}
