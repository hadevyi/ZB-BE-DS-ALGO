package chapter03_List;

public class List02_LinkedList만들기 {

    public static class CustomLinkedList {

        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private int size = 0;

        public void add(int value) {
            if (head == null) {
                head = new Node(value);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(value);
            }
            size++;
        }

        public void add(int index, int value) {
            if (index < 0 || index > size) {
                System.out.println("유효하지 않은 인덱스입니다. (index: " + index + ")");
                return;
            }

            Node newNode = new Node(value);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.next;
                }
                newNode.next = prev.next;
                prev.next = newNode;
            }
            size++;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                System.out.println("유효하지 않은 인덱스입니다. (index: " + index + ")");
                return -1;
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        public int remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("유효하지 않은 인덱스입니다. (index: " + index + ")");
                return -1;
            }

            int removedValue;
            if (index == 0) {
                removedValue = head.data;
                head = head.next;
            } else {
                Node prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.next;
                }
                removedValue = prev.next.data;
                prev.next = prev.next.next;
            }
            size--;
            return removedValue;
        }

        public int size() {
            return size;
        }

        public void printList() {
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            Node current = head;
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) sb.append(", ");
                current = current.next;
            }
            sb.append("]");
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();  // [10, 20, 30]

        list.add(1, 15); // 인덱스 1에 15 추가
        list.printList(); // [10, 15, 20, 30]

        list.remove(2); // 인덱스 2의 요소(20) 삭제
        list.printList(); // [10, 15, 30]

        System.out.println("Index 1의 값: " + list.get(1));   // 15 출력
        System.out.println("Index 5의 값: " + list.get(5));   // 오류 메시지 출력, -1 반환
        System.out.println("리스트 크기: " + list.size());     // 3 출력

        list.add(100, 99); // 오류 메시지 출력
        list.remove(-1);   // 오류 메시지 출력
    }
}
