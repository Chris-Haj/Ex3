public class BTree <E> {
    private Node<E> root;
    private int size = 0;

    public BTree() {
        this.root = null;
    }

    public void add(E d) {
        if (root == null) {
            root = new Node<>(d);
            size++;
            return;
        }
        if (root.getLeftSon() == (null)) {
            root.setLeftSon(new Node<E>(d));
            size++;
            return;
        }
        if (root.getRightSon() == (null)) {
            root.setRightSon(new Node<E>(d));
            size++;
            return;
        }

        if (Math.abs(recursiveHeight() - recursiveHeight()) <= 1) {
            root = root.getLeftSon();
            add(d);
        } else {
            root = root.getRightSon();
            add(d);
        }

    }

    private int recursiveHeight() {
        if (root.getLeftSon() == null)
            return 0;
        else {
            root = root.getLeftSon();
            return 1 + recursiveHeight();
        }
    }


    public int height() {
        return recursiveHeight();
    }

    public int size() {
        return checkSize(root);
    }

    private int checkSize(Node<E> node) {
        if (node == null)
            return 0;
        else {
            return 1 + checkSize(node.getLeftSon()) + checkSize(node.getRightSon());
        }

    }

}




