package HomeWork.Tree;

import java.util.Scanner;

/**
 * Класс RedBlackTree представляет красно-черное дерево и содержит методы для вставки и обхода узлов.
 */
public class RedBlackTree {
    private static Treenode root = null;

    /**
     * Метод Left выполняет левый поворот узла.
     *
     * @param currentNode Узел, для которого выполняется поворот.
     * @return Новый корневой узел поддерева после поворота.
     */
    Treenode rotateLeft(Treenode currentNode) {
        System.out.printf("поворот влево!\n");
        Treenode child = currentNode.right;
        Treenode childLeft = child.left;

        child.left = currentNode;
        currentNode.right = childLeft;

        return child;
    }

    /**
     * Метод Right выполняет правый поворот узла.
     *
     * @param currentNode Узел, для которого выполняется поворот.
     * @return Новый корневой узел поддерева после поворота.
     */
    Treenode rotateRight(Treenode currentNode) {
        System.out.printf("поворот вправо!\n");
        Treenode child = currentNode.left;
        Treenode childRight = child.right;

        child.right = currentNode;
        currentNode.left = childRight;

        return child;
    }

    /**
     * Метод isRED проверяет, является ли узел красного цвета.
     *
     * @param currentNode Узел, который проверяется.
     * @return true, если узел красного цвета, иначе false.
     */
    boolean isRED(Treenode currentNode) {
        if (currentNode == null) {
            return false;
        }
        return (currentNode.isRed == true);
    }

    /**
     * Метод changeColor меняет цвет двух узлов.
     *
     * @param node1 Первый узел.
     * @param node2 Второй узел.
     */
    void swapColors(Treenode node1, Treenode node2) {
        boolean temp = node1.isRed;
        node1.isRed = node2.isRed;
        node2.isRed = temp;
    }

    /**
     * Метод insert выполняет вставку в красно-черное дерево.
     *
     * @param currentNode Корневой узел текущего поддерева.
     * @param data        Значение, которое нужно вставить.
     * @return Новый корневой узел поддерева после вставки.
     */
    Treenode insert(Treenode currentNode, int data) {
        // Обычный код вставки для любого двоичного дерева
        if (currentNode == null) {
            return new Treenode(data);
        }
        if (data < currentNode.data) {
            currentNode.left = insert(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = insert(currentNode.right, data);
        } else {
            return currentNode;
        }
        // 1. Правый дочерний элемент красный, а левый дочерний элемент черный или не существует.
        if (isRED(currentNode.right) && !isRED(currentNode.left)) {
            // Поворачиваем узел влево
            currentNode = rotateLeft(currentNode);
            // Меняем цвета дочернего узла, всегда должен быть красным
            swapColors(currentNode, currentNode.left);
        }
        // 2. Левый ребенок, а также левый внук выделены красным цветом
        if (isRED(currentNode.left) && isRED(currentNode.left.left)) {
            // Поворачиваем узел вправо
            currentNode = rotateRight(currentNode);
            swapColors(currentNode, currentNode.right);
        }
        // 3. Левый и правый дочерние элементы окрашены в красный цвет.
        if (isRED(currentNode.left) && isRED(currentNode.right)) {
            // Инвертируем цвет узла и его детей
            currentNode.isRed = !currentNode.isRed;
            // Изменяем цвет на черный
            currentNode.left.isRed = false;
            currentNode.right.isRed = false;
        }
        return currentNode;
    }

    /**
     * Метод order выполняет обход узлов в порядке возрастания и выводит их значения.
     *
     * @param currentNode Узел, с которого начинается обход.
     */
    void inorderTraversal(Treenode currentNode) {
        if (currentNode != null) {
            inorderTraversal(currentNode.left);
            char col = '⚫';
            if (currentNode.isRed == false)
                col = '⭕';
            System.out.print(currentNode.data + "" + col + " ");
            inorderTraversal(currentNode.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree redBlackTree = new RedBlackTree();
        Scanner scanner = new Scanner(System.in);

        char ch;
        do {
            System.out.println("Введите целое число: ");
            int number = scanner.nextInt();
            root = redBlackTree.insert(root, number);

            redBlackTree.inorderTraversal(root);
            System.out.println("\nЖелаете ли вы продолжить? (введите y или n)");
            ch = scanner.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}