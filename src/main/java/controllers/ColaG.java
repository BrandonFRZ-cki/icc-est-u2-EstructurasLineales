package controllers;

import models.NodeGenerico;

import java.util.EmptyStackException;

public class ColaG <T> {
    private NodeGenerico<T> primero;
    private NodeGenerico<T> ultimo;
    private int size;

    public ColaG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public NodeGenerico<T> getPrimero() {
        return primero;
    }

    public void setPrimero(NodeGenerico<T> primero) {
        this.primero = primero;
    }

    public NodeGenerico<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodeGenerico<T> ultimo) {
        this.ultimo = ultimo;
    }
    public boolean isEmpty() {
        return primero == null;
    }

    public void add(T value) {
        NodeGenerico newNodeGenerico = new NodeGenerico<>(value);
        if (isEmpty()) {
            primero = newNodeGenerico;
            ultimo = newNodeGenerico;
        }else {
            ultimo.setNext(newNodeGenerico);
            ultimo = newNodeGenerico;
        }
        size++;
    }
    public T remove() {
        if (isEmpty())
            throw new EmptyStackException();

        T value = primero.getValue();
        primero = primero.getNext();
        size--;
        return value;
    }
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return primero.getValue();
    }
    public void print() {
        while (primero != null) {
            System.out.print(primero.getValue()+" , ");
            primero = primero.getNext();
        }
    }
    public int size() {
        return size;
    }



}
