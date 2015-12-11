package IteratorPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public interface QueryResultsIterator {
    public String first();
    public String next();
    public String currentItem();
    public boolean isDone();
}
