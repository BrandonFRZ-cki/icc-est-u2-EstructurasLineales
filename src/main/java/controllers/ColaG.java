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
        NodeGenerico<T> temp = primero;
        while (temp != null) {
            System.out.print(temp.getValue()+" , ");
            temp = temp.getNext();
        }
    }
    public int size() {
        return size;
    }

    public int findByName(String name) {
        int posicion = 0;
        NodeGenerico<T> node = primero;
        while (node != null) {
            if (node.getValue().toString().equals(name)) {
                return posicion;
            }
            node = node.getNext();
            posicion++;
        }
        return -1;
    }

    public void removeByName(String name) {
        int posicion = findByName(name);
        if (posicion == -1) {
            System.out.println("No existe el elemento");;
        }

        if (posicion == 0) { // si el coso es el primero
            primero = primero.getNext();
            if (primero == null) {
                ultimo = null;
            }
            size--;
            return;
        }
        NodeGenerico<T> nodoAEliminar = primero;
        NodeGenerico<T> nodoAntesDelEliminado = null;
        for (int i = 0; i < posicion; i++) { // Elimino el buscado
            nodoAntesDelEliminado = nodoAEliminar;
            nodoAEliminar = nodoAEliminar.getNext();
        }
        if (nodoAEliminar != null) {
            nodoAntesDelEliminado.setNext(nodoAEliminar.getNext());
            if (nodoAEliminar == ultimo) {
                ultimo = nodoAntesDelEliminado;
            }
            size--;
        }
    }

}
