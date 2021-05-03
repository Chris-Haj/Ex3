public class BTree <E>{
    private Node<E> root;

    public BTree() {
        root=null;
    }

    public void add(E d){
        if(root.getLeftSon().equals(null)) {
            root.setLeftSon((Node<E>) d);
            return;
        }
        if(root.getRightSon().equals(null)) {
            root.setRightSon((Node<E>) d);
            return;
        }

        if(Math.abs(recursiveHeight(root.getLeftSon()) - recursiveHeight(root.getRightSon()) <= 1)) {
            root = root.getLeftSon();
            add(d);
        }
        else {
            root = root.getLeftSon();
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


    }

    public String in(){


    }
    private String prv(Node left,Node right){
        if(left.getLeftSon()&&left.getRightSon()&&right.getLeftSon()&&right.getRightSon())
            return "";
        else{

        }
    }

    public String post(){

    }

    public int height(){
        int height=0;
        for(;root.getLeftSon()!=null;root= root.getLeftSon()){
            height++;
        }
        return height;
        }
    public int size(){

    }

    public String path(int length){

    }

    @Override
    public String toString() {
        return String.valueOf(root)+"\n"
                +String.valueOf(root.getLeftSon())+"  "+String.valueOf(root.getRightSon());
    }
}


