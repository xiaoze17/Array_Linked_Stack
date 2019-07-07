package com.xiaoze17;

public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> list;

    public LinkedListStack() {

        list = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E peek() {
        return list.get(0);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("LinkedListStack: top ");
        res.append(list);
        return res.toString();
    }
    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            linkedListStack.push(i);
            System.out.println(linkedListStack);
        }

        linkedListStack.pop();
        System.out.println(linkedListStack);
    }
}
