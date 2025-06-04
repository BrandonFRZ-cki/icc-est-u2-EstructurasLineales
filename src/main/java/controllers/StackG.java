package controllers;

import models.NodeGenerico;

import java.util.EmptyStackException;

public class StackG<T> {
    private int contador;
    private NodeGenerico<T> top;

    public StackG() {
        contador = 0;
        this.top = null;
    }
    // Metodo que ingrese un valor
    public void push(T value) {
        NodeGenerico<T> newNodeGenerico = new NodeGenerico<>(value);
        newNodeGenerico.setNext(top);
        top = newNodeGenerico;
        contador++;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        contador--;
        return value;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return top.getValue();

    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }else {
            NodeGenerico<T> topTemp = top;
            while (topTemp != null) {
                System.out.print(topTemp.getValue() + " ");
                topTemp = topTemp.getNext();
            }
        }
    }
    public int size(){
        return contador;
    }


}
