package IteratorPattern;

import java.util.ArrayList;

/**
 * Created by yunlongxu on 12/11/15.
 */
public class QueryResultsIteratorImpl implements QueryResultsIterator {
    ArrayList<String> results;
    private int cursor;
    private int max;

    public QueryResultsIteratorImpl(ArrayList<String> results) {
        this.results = results;
        cursor = 0;
        max = results.size();
    }

    @Override
    public String first() {
        return results.get(0);
    }

    @Override
    public String next() {
        cursor++;
        if (!isDone()) {
            return results.get(cursor);
        } else {
            return "<end>";
        }
    }

    @Override
    public String currentItem() {
        return results.get(cursor);
    }

    @Override
    public boolean isDone() {
        return (cursor == max);
    }
}
