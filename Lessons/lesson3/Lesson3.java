package ru.gb.lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        // TDD Test Driven Development

        // add(x) pop() peek()
        // Queue FIFO First In First Out
        // Stack LIFO Last  In First Out

//        LinkedList add -> addFirst, pop -> pollFirst() -> STACK
//        LinkedList add -> add,      pop -> poll() -> QUEUE

        // [1, 2, 3, 4, 5]
        // a = [null, 1, ->b]
        // b = [ a<-, 2, ->c]
        // c = [ b<-, 3, ->d]
        // d = [ c<-, 4, ->e]
        // e = [ d<-, 5, null]

        // python ->

        // Interface [Java, Python]

        MyLinkedList myLinkedList = new MyLinkedList();
//        System.out.println(myLinkedList.get(-2)); // IndexOutOfBounds
//        System.out.println(myLinkedList.get(0)); // IndexOutOfBounds
        System.out.println(myLinkedList);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList);

        System.out.println(myLinkedList.get(0)); // 1
        System.out.println(myLinkedList.get(1)); // 2
        System.out.println(myLinkedList.get(2)); // 3
        System.out.println(myLinkedList.get(3)); // 4
//        System.out.println(myLinkedList.get(4)); // IndexOutOfBounds
        System.out.println();

//        System.out.println(myLinkedList.pop(-1)); // IndexOutOfBounds

        System.out.println(myLinkedList.pop(2)); // 3
        System.out.println(myLinkedList.pop(2)); // 4
//        System.out.println(myLinkedList.pop(2)); // IndexOutOfBounds
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.popFirst()); // 1
        System.out.println(myLinkedList); // [2]

    }

}
