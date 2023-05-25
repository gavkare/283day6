import org.w3c.dom.Node;

public class LinkedList<T> {
        Node<T> head;
        Node<T> tail;

        public void push(T key) {

            Node<T> newNode = new Node<T>();

            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }

        }

    }

