package Lections;

public class MyLinkedList {

    /**
     * Реализовать следующие методы
     * 1. public int size() - получить размер списка
     * 2. public boolean contains(int value) - проверить наличие элемента в списке
     * 3.* public MyLinkedList reversed() - создать НОВЫЙ список с обратным порядком
     * 4.** Заменить все int значения на дженерик T
     * 5.* Любые другие доработки, которые захотите для тренировки
     */

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;

    public int size(){
        int count = 0;
        if(head != null){
            count++;
            while(head.next != null){
                count++;
                head = head.next;
            }
            }else{
                return 0;
            }
        return count;
    }

    public boolean contains(int value){
        Node current = head;
    	while(current.next != null){
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node last = findLast();
            last.next = new Node(value);
        }
    }

    public int getFirst() {
        return get(0);
    }

    public int get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex == index && current != null) {
            return current.value;
        }
        throw new IndexOutOfBoundsException();
    }

    public int popFirst() {
        return pop(0);
    }

    public int pop(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            int pop = head.value;
            head = head.next;
            return pop;
        }

        Node previous = head; // предыдущая от искомой
        int currentIndex = 1;
        while (previous.next != null) {
            if (currentIndex == index) {
                int pop = previous.next.value;
                previous.next = previous.next.next;
                return pop;
            }

            previous = previous.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException();
    }

    public MyLinkedList reversed() {
        // TODO: 25.05.2023 Реализовать пункт 4
        // throw new UnsupportedOperationException();
        return new MyLinkedList();
    }

    private Node findLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = head;
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

class Main
{
	public static void main(String[] args) {
        // Создание связанного списка
		MyLinkedList list = new MyLinkedList();

        // Заполнение связанного списка числами
        for(int i=0; i<10; i++){
            list.add(i); // 0 ... 9
        }

        int value = 3; // искомое значение
		boolean isExists = list.contains(value);
		System.out.println(isExists);

        //Определение размера связанного списка
        System.out.println(list.size());
    }
}