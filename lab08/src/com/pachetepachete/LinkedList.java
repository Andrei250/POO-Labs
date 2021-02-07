package com.pachetepachete;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    Node<T> first, last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public void addFirst(T data) {
        this.first = new Node<>(data, this.first);
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (this.last == null) {
            this.first = this.last = node;
        } else {
            this.last.next = node;
            this.last = node;
        }
    }

    public Node<T> getHead() {
        return this.first;
    }

    public T getNode() {
        if (this.first == null) {
            return null;
        }

        return this.first.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }

    static class ListIterator<T> implements Iterator<T> {
        Node<T> current;

        public ListIterator(LinkedList<T> list)
        {
            current = list.getHead();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    private static class Node<T> {
        T data;
        LinkedList.Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
