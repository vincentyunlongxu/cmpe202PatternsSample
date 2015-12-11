package IteratorPattern;

/**
 * Created by yunlongxu on 12/11/15.
 */
public interface QueryResults {
    public QueryResultsIterator createIterator();
    public void fetchData();
}
