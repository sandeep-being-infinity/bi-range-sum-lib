package io.github.sandeepbi;

import io.github.sandeepbi.AbstractRangeQueries;

public class PrefixSumRangeQueries extends AbstractRangeQueries{
    private long prefixSum[];
    public PrefixSumRangeQueries(int arr[]){
        prefixSum = new long[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i == 0)
                prefixSum[i] = arr[i];
            else
                prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
    }
    public long rangeSum(int startIdx, int endIdx){
        if(startIdx == 0)
            return prefixSum[endIdx];
        return prefixSum[endIdx] - prefixSum[startIdx - 1];
    }
}
