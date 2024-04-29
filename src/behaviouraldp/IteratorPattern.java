package behaviouraldp;

public class IteratorPattern {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> second = new Node<>(2);
        Node<Integer> third = new Node<>(3);
        Node<Integer> fourth = new Node<>(4);

        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

//        Iterator<Integer> iterator = new NormalIterator<>(head);
        Iterator<Integer> iterator = head.getIterator();

        while (iterator.hasNext()) {
            Node<Integer> node = iterator.getNext();
            System.out.println(node.getData());
        }

    }
}

interface Iterator<T> {
    boolean hasNext();
    Node<T> getNext();
    void reset();
}

class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Iterator<T> getIterator() {
        return new NormalIterator<>(this);
    }
}

class NormalIterator<T> implements Iterator<T> {
    private Node<T> head;
    private Node<T> current;

    public NormalIterator(Node<T> head) {
        this.head = head;
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node<T> getNext() {
        Node<T> temp = current;
        current = current.getNext();
        return temp;
    }

    @Override
    public void reset() {
        current = head;
    }
}

