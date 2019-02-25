package datastructure.binarytree;

public class BinaryTree {

    static class Node {
        Object element;
        Node left, right;

        Node(Object e, Node l, Node r) {
            element = e;
            left = l;
            right = r;
        }

        boolean isLeaft() {
            return left == null && right == null;
        }

        @Override
        public String toString() {
            return "element: " + element + " left: " + left + " right:" + right;
        }
    }

    Node root;

    public int height() {
        return height(root);
    }

    void inOrder(Visitor v) {
        inOrder(root, v);
    }

    private void inOrder(Node x, Visitor v) {
        if (x == null) return;
        inOrder(x.left, v);
        v.visit(x.element);
        inOrder(x.right, v);
    }

    private int height(Node node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }


}
