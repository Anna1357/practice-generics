package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;

public class Pairs<T, D> implements Iterable<Pair<T, D>> {
    public Pairs() {
    }

    public boolean addPair(T first, D second) {
        return true;
    }

    @Override
    public Iterator<Pair<T, D>> iterator() {
        return new PairIterator();
    }

    private class PairIterator implements Iterator<Pair<T, D>> {

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Pair<T, D> next() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
