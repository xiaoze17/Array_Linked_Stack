package com.xiaoze17;

public interface Stack<T> {

    int getSize();
    boolean isEmpty();
    void push(T elem);
    T pop();
    T peek();

}
