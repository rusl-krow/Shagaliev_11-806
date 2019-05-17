import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private class MyLinkedListIterator implements Iterator<T> {
        Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T result = current.value;
            current = current.next;
            return result;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }
    private Node<T> head;

    public LinkedList<T> myStream() {
        return this;
    }

    private class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

    }

    private boolean IsHead() {
        if (head == null) {
            return false;
        }
        return true;
    }

    public void add(T value) {
        if (!IsHead()) {
            head = new Node<>(value);
        } else {
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(value);
        }
    }
}
