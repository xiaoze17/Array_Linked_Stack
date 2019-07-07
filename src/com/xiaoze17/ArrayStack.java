package com.xiaoze17;

public class ArrayStack<T> implements Stack<T> {

    private Array<T> array;

    public ArrayStack(int capacity) {
        array = new Array<>(capacity);
    }
    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(T elem) {
        array.addLast(elem);
    }

    @Override
    public T pop() {
        return array.deleteLast();
    }

    @Override
    public T peek() {
        int index = array.getSize()-1;
        return array.get(index);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: [");
        for (int i = 0; i < array.getSize(); i++) {
            res.append(array.get(i));
            if (i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();

    }

    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(0);
        System.out.println(arrayStack);
        arrayStack.push(1);
        System.out.println(arrayStack);
        arrayStack.push(2);
        System.out.println(arrayStack);
        arrayStack.pop();
        System.out.println("After pop get elem:"+arrayStack.peek());
        //System.out.println(arrayStack.peek());
    }
}
