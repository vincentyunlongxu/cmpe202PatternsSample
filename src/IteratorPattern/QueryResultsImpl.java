package IteratorPattern;

import java.util.ArrayList;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class QueryResultsImpl implements QueryResults {
    private ArrayList<String> results = new ArrayList<String>();

    @Override
    public QueryResultsIterator createIterator() {
        return new QueryResultsIteratorImpl(results);
    }

    @Override
    public void fetchData() {
        results.add("Iterm 1");
        results.add("Iterm 2");
        results.add("Iterm 3");
        results.add("Iterm 4");
        results.add("Iterm 5");
        results.add("Iterm 6");
        results.add("Iterm 7");
        results.add("Iterm 8");
        results.add("Iterm 9");
        results.add("Iterm 10");

    }
}
