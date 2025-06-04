package controllers;

import models.Node;

import java.util.EmptyStackException;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }
    // Metodo que ingrese un valor
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getValue();
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }else {
            Node topTemp = top;
            while (topTemp != null) {
                System.out.print(topTemp.getValue() + " ");
                topTemp = topTemp.getNext();
            }
        }
    }

}
