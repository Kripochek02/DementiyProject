package com.example.dementiy.placeholder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<T>  implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size=0;


    @Override
    public String toString() {
        String s = "[";Node<T> item = head;
        while(item != null) {
            s += item + ", ";
            item = item.getNext();
        }
        return s + "]";
    }
    public void remove(int i) {
        if (i < 0 || i >= size) {return;}
        Node<T> item = head;
        for (int j = 1; j < i; j++) {
            item = item.getNext();
        }
        if (i != 0) {
            item.setNext(item.getNext().getNext());
            if (i == size - 1) tail = item;
            head = head.getNext();
        } else {
            head = head.getNext();
        }
        size--;
        if (size == 1) {
            tail = head;
        }
    }

    @Override
    public int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<T> listIterator(int i) {
        return null;
    }

    @NonNull
    @Override
    public List<T> subList(int i, int i1) {
        return null;
    }

    public T get(int i) {
        Node<T> item = head;
        for (int j = 0; j < i; j++) {
            item = item.getNext();
        }
        return item.getValue();
    }

    @Override
    public T set(int i, T t) {
        return null;
    }

    @NonNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> cursor = head;
            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public T next() {
                T next = cursor.getValue();
                cursor = cursor.getNext();
                return next;
            }
        };
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T1> T1[] toArray(@NonNull T1[] t1s) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, @NonNull Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    public void add(int i, T test) {
        return true;
    }

    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    public void offer(T пятый) {
    }
}
