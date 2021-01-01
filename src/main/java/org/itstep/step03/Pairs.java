package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pairs<K, V> implements Iterable<Pair<K, V>> {
    public final Pair<K,V>[]pairs;
    private static final int CAPACITY=10;
    private int idx;
    public Pairs() {
        pairs=new Pair[CAPACITY];
    }

    public boolean addPair(K first, V second) {
if(idx<CAPACITY){
    pairs[idx]=new Pair<>(first,second);
    idx++;
    return true;
}
return false;
    }

    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new PairIterator();
    }

    private class PairIterator implements Iterator<Pair<K, V>> {
        private int i;
private boolean callNext;
        @Override
        public boolean hasNext() {
            return i<idx;
        }

        @Override
        public Pair<K, V> next() {
            callNext=true;
            if(i>=idx)
            {
               throw new NoSuchElementException();
            } return pairs[i++];
        }

        @Override
        public void remove() {
            if(!callNext)
            {
                throw new IllegalStateException();
            }
          for(int j=i;j<idx;j++){
              pairs[j-1]=pairs[j];
          }
          idx--;
          callNext=false;
        }
    }
}
