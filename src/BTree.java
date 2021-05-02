public class BTree <E>{
    private Node<E> root;

    public BTree() {
        root=null;
    }

    public void add(E d){
        if(root.getLeftSon().equals(null))
            root.setLeftSon((Node<E>) d);
        if(root.getRightSon().equals(null))
            root.setRightSon((Node<E>)d);

    }

    @Override
    public String toString() {
        return String.valueOf(root)+"\n"
                +String.valueOf(root.getLeftSon())+"  "+String.valueOf(root.getRightSon());
    }
}


