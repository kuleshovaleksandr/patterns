package main.java.patterns.behavioral.iterator;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
