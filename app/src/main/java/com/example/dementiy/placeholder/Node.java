package com.example.dementiy.placeholder;

public class Node <T> {
    private T value;
    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T val) {
        this.value = val;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
