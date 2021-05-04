public class BTree<E> {
    private Node<E> root;


    public BTree() {
        this.root = null;
    }

    public void add(E d) {
        if (root == null) {
            root = new Node<>(d);

            return;
        } else if (root.getLeftSon() == (null)) {
            root.setLeftSon(new Node<E>(d));
            return;
        } else if (root.getRightSon() == (null)) {
            root.setRightSon(new Node<E>(d));
            return;
        }
        addnode(root, d);

    }

    private void addnode(Node<E> node, E d) {
        if (node.getLeftSon() == null) {
            node.setLeftSon(new Node<>(d));
            return;
        } else if (node.getRightSon() == null) {
            node.setRightSon(new Node<>(d));
            return;
        }

        if (Math.abs(findHeight(node.getLeftSon()) - findHeight(node.getRightSon())) <= 1) {
            addnode(node.getLeftSon(), d);
        } else
            addnode(node.getRightSon(), d);

    }

    public String post() {
        postOrder(root);
        return "";
    }

    private void postOrder(Node<E> node) {
        if (node == null)
            return;
        else {
            postOrder(node.getLeftSon());
            postOrder(node.getRightSon());
            System.out.print(node.getData() + "\t");
        }
    }


    public String pre() {
        preorder(root);
        return "";
    }

    private void preorder(Node<E> node) {
        if (node == null)
            return;
        else {
            System.out.print(node.getData() + "\t");
            postOrder(node.getLeftSon());
            postOrder(node.getRightSon());
        }
    }

    public String in() {
        inOrder(root);
        return "";
    }

    private void inOrder(Node<E> node) {
        if (node == null) {
            return;
        } else {
            inOrder(node.getLeftSon());
            System.out.print(node.getData() + "\t");
            inOrder(node.getRightSon());
        }
    }


    public int height() {
        return findHeight(root);
    }

    private int findHeight(Node node) {
        if (node == null)
            return 0;
        else
            return 1 + Math.max(findHeight(node.getLeftSon()), findHeight(node.getRightSon()));

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
    public String path(int length){
        
    }
    

    
    
    


}




