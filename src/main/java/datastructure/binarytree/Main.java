package datastructure.binarytree;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        BSTree bst = new BSTree();
//        bst.
//        bst.add(10);
//        bst.add(5);
//        bst.add(30);
//        bst.add(40);
//        bst.remove(5);
//        System.out.println(bst.getMin());
        Integer[] data = new Integer[]{2, 3, 4, 1, 10};
        BSTree.treeSort(data);
        System.out.println(Arrays.toString(data));
    }
}
