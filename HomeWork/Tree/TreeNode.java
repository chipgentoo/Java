package HomeWork.Tree;

/**
 * Класс node представляет узел красно-черного дерева.
 */
class Treenode {
    Treenode left, right;
    int data;

    // красный ==> true, черный ==> false
    boolean isRed;

    Treenode(int data) {
        left = null;
        right = null;

        // Новый узел, который создается, всегда красного цвета.
        isRed = true;
    }
}