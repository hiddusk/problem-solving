package mergeintervals;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        this.start=start;
        this.end=end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

/* TimeComplexity is O(n*Log(n)) and Space Complexity is O(1) */
public class MergeIntervals {

    public static void main(String[] args) {
        Interval[] arr = new Interval[4];
        arr[0] = new Interval(1,3);
        arr[1] = new Interval(2,4);
        arr[2] = new Interval(6,8);
        arr[3] = new Interval(9,10);
        mergeIntervals(arr);

    }

    private static void mergeIntervals(Interval[] arr) {
        int index=0;
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.getStart() - o2.getStart();
            }
        });
        for(int i=1;i<arr.length;i++) {
            if(arr[index].getEnd()>=arr[i].getStart()) {
                arr[index].setEnd(Math.max(arr[index].getEnd(), arr[i].getEnd()));
            } else {
                index++;
                arr[index]=arr[i];
            }
        }
        for(int i=0;i<=index;i++) {
            System.out.println(arr[i].getStart() + "-" + arr[i].getEnd());
        }
    }
}
