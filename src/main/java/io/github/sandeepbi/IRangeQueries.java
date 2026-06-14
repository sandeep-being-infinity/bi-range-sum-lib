package io.github.sandeepbi;

public interface IRangeQueries {
    public abstract long rangeSum(int startIdx, int endIdx);
    public abstract long rangeSum(int endIdx);
}
