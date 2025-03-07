package chapter04_List_Problem_Solving;

public class List01_Double_Linked_List {

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoubleLinkedList {
        private Node head;
        private Node tail;
        private int size;

        public DoubleLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        public void add(int index, int data) {
            if (index < 0 || index > size) {
                System.out.println("유효하지 않은 인덱스");
                return;
            }

            if (index == 0) {
                addFirst(data);
                return;
            }
            if (index == size) {
                add(data);
                return;
            }

            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("리스트가 비어 있습니다.");
                return;
            }
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("리스트가 비어 있습니다.");
                return;
            }
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("유효하지 않은 인덱스");
                return;
            }

            if (index == 0) {
                removeFirst();
                return;
            }
            if (index == size - 1) {
                removeLast();
                return;
            }

            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                System.out.println("유효하지 않은 인덱스");
                return -1;
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        public void printList() {
            StringBuffer sb = new StringBuffer();
            Node current = head;
            sb.append("[");
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) sb.append(", ");
                current = current.next;
            }
            sb.append("]");
            System.out.println(sb.toString());
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();       // 10 20 30

        list.addFirst(5);
        list.printList();       // 5 10 20 30

        list.add(2, 15);
        list.printList();       // 5 10 15 20 30

        list.removeLast();
        list.printList();       // 5 10 15 20

        list.removeFirst();
        list.printList();       // 10 15 20

        list.remove(1);
        list.printList();       // 10 20

        list.remove(10);    // 오류 메시지 출력

        System.out.println("인덱스 1의 값: " + list.get(1)); // 20
    }
}
