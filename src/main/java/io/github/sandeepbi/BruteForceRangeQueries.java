package io.github.sandeepbi;

public class BruteForceRangeQueries extends AbstractRangeQueries{
    private int arr[];
    public BruteForceRangeQueries(int arr[]){
        this.arr = arr;
    }
    public long rangeSum(int startIdx, int endIdx){
        long sum = 0;
        for(int i = startIdx; i <= endIdx; i++){
            sum += arr[i];
        }
        return sum;
    }
}
