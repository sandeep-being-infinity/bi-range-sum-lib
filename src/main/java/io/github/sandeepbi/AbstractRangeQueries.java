package io.github.sandeepbi;

public abstract class AbstractRangeQueries implements IRangeQueries{
    public long rangeSum(int endIdx){
        return rangeSum(0, endIdx);
    }
}
