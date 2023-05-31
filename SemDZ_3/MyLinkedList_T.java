package SemDZ_3;

// 4.** Заменить все int значения на дженерик T

public class MyLinkedList_T<T> {
    
    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    public int size_T;

    public void add(T value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<T> last = findLast();
            last.next = new Node<>(value);
        }
        size_T++;
    }

    private Node<T> findLast() {
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public T getFirst() {
        return get(0);
    }

    public T get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index && current != null) {
            return current.value;
        }
        throw new IndexOutOfBoundsException(index);
    }

    // проверить наличие элемента в списке
    public boolean contains(T value) {
        boolean temp = false;
        if (head == null) {
            return temp;
        }
        Node<T> current = head;
        while (current != null) {
            if (current.value == value) {
                temp = true;
                return temp;
            }
            current = current.next;
        }
        return temp;
    }

    // создать НОВЫЙ список с обратным порядком
    public MyLinkedList_T<T> reversed() {
        if (head == null) {
            throw new UnsupportedOperationException();
        }
        int count = size_T;
        MyLinkedList_T<T> MyLL_T = new MyLinkedList_T<>();
        
        for (int i = count-1; i >= 0; i--) {
            MyLL_T.add(get(i));
        }
        return MyLL_T;
    }

    // новый список с обратным порядком без add и get
    public MyLinkedList_T<T> reversed_T() {
        MyLinkedList_T<T> reverseadList = new MyLinkedList_T<>();
        addRecursiv(head, reverseadList);
        reverseadList.add(head.value);
        return reverseadList;
    }

    private void addRecursiv(Node<T> node, MyLinkedList_T<T> list) {
        if (node.next != null) {
            addRecursiv(node.next, list);
            list.add(node.next.value);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.value).append(" -> ");
            current = current.next;
        }

        int length = result.length();
        if (length > 4) {
            result.delete(length - 4, length);
        }

        result.append("]");
        return result.toString();
    }

}
