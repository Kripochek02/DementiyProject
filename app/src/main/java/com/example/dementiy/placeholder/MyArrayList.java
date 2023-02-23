package com.example.dementiy.placeholder;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T>{
    private T[] array;
    private int size = 0;
    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    public void clear() {
        array = (T[]) new Object[10];
        size = 0;
    }
    public void add(T value) {
        if (size >= array.length) {
            T[] a = (T[]) new Object[2*array.length];
            System.arraycopy(array, 0, a, 0, array.length);
            this.array = a;
        }
        this.array[size] = value;
        size++;
    }
    public T get(int i) {
        if (i > size - 1) {
            throw new ArrayIndexOutOfBoundsException("index "+ i + " out of bounds for length" + size);
        }
        return this.array[i];
    }
    public boolean remove(int i) {
        this.get(i);
        if (i < size - 1) {
            System.arraycopy(array, i + 1, array, i, size - i - 1);
        }
        this.array[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @NonNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int cursor = 0;
            @Override
            public boolean hasNext() {
                return cursor < size;
            }
            @Override
            public T next() {
                T next = array[cursor];
                cursor++;
                return next;
            }
        };
    }
}

