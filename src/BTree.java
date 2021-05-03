public class BTree <E>{
    private Node<E> root;

    public BTree() {
        root=null;
    }

    public void add(E d){

        if(root.getLeftSon()==(null)) {
            root.setLeftSon(new Node<E>(d));
            return;
        }
        if(root.getRightSon()==(null)) {
            root.setRightSon(new Node<E>(d));
            return;
        }

        if(Math.abs(recursiveHeight(root.getLeftSon()) - recursiveHeight(root.getRightSon()))<=1) {
            root = root.getLeftSon();
            add(d);
        }
        else {
            root = root.getRightSon();
            add(d);
        }

    }

    private int recursiveHeight(Node<E> node){
        if(node.getLeftSon()==null)
            return 0;
        else{
            return 1+recursiveHeight(node.getLeftSon());
        }
    }

    public String pre(){
        String ordered="";
        
    }

    public int height(){
        int height=0;
        for(;root.getLeftSon()!=null;root= root.getLeftSon()){
            height++;
        }
        return height;
        }

    public int size(){
        return checkSize(root);
    }

    private int checkSize(Node<E> node){
        if (node==null)
            return 0;
        else{
            return 1+checkSize(node.getLeftSon())+checkSize(node.getRightSon());
        }
    }



}


