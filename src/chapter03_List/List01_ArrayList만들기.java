package chapter03_List;

public class List01_ArrayList만들기 {

    // int 전용 ArrayList (Static 내부 클래스)
    public static class CustomArrayList {
        private static final int DEFAULT_SIZE = 10; // 기본 크기
        private int[] data;                         // 데이터를 저장할 배열
        private int size = 0;                       // 현재 저장된 요소 개수

        public CustomArrayList() {
            data = new int[DEFAULT_SIZE];
        }

        public void add(int value) {
            resizeDataSize();
            data[size++] = value;
        }

        public void add(int index, int value) {
            if (index < 0 || index > size) {
                System.out.println("유효하지 않은 인덱스입니다. (index: " + index + ")");
                return;
            }

            resizeDataSize();

            // 요소를 뒤로 밀기
            for (int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }

            data[index] = value;
            size++;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                System.out.println("유효하지 않은 인덱스입니다. (index: " + index + ")");
                return -1; // 기본값 반환
            }
            return data[index];
        }

        public int remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("유효하지 않은 인덱스입니다. (index: " + index + ")");
                return -1; // 기본값 반환
            }

            int removedValue = data[index];

            // 요소를 앞으로 당기기
            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            data[--size] = 0; // 마지막 요소 제거
            return removedValue;
        }

        public int size() {
            return size;
        }

        private void resizeDataSize() {
            if (size < data.length) return;

            int newSize = data.length * 2;
            int[] newArray = new int[newSize];
            System.arraycopy(data, 0, newArray, 0, data.length);
            data = newArray;
            System.out.println("배열 크기 증가: " + newSize);
        }

        public void printList() {
            StringBuffer sb = new StringBuffer();
            sb.append("[");

            for (int i = 0; i < size; i++) {
                sb.append(data[i]);
                if (i < size - 1) sb.append(", ");
            }

            sb.append("]");
            System.out.println(sb.toString());
        }

    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();  // [10, 20, 30]

        list.add(1, 15); // 인덱스 1에 15 추가
        list.printList();           // [10, 15, 20, 30]

        list.remove(2); // 인덱스 2의 요소(20) 삭제
        list.printList();     // [10, 15, 30]

        System.out.println("Index 1의 값: " + list.get(1));   // 15 출력
        System.out.println("Index 5의 값: " + list.get(5));   // 오류 메시지 출력, -1 반환
        System.out.println("리스트 크기: " + list.size());     // 3 출력

        list.add(100, 99); // 오류 메시지 출력
        list.remove(-1);         // 오류 메시지 출력
    }
}
