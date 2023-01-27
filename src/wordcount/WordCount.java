package wordcount;

public class WordCount {
    public static void main(String[] args) {
        String input = "Hello World Hello World";
        String[] arr = input.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++) {
            count=1;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i].equals(arr[j])) {
                    count = count +1;
                    arr[j]="0";
                }
            }
            if(arr[i]!="0") {
                System.out.println(arr[i] + "====>" + count);
            }
        }
    }
}
