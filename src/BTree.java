public class BTree <E>{
    private Node<E> root;

    public BTree() {
        root=null;
    }

    private int findMax(int a, int b){
        if(a >= b)
            return a;
        else
            return b;
    }

    private int findHeight(Node root){
        // Base case:
        if(root == null)
            return 0;

        return findMax(findHeight(root.getLeftSon()), findHeight(root.getRightSon())) + 1;
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
        int left=0,right=0;
        for(int i=0;root.getLeftSon()==null;){
            if(root.getLeftSon()!=null)
                left++;
            if(root.getRightSon()!=null)
                right++;
        }


    }

    public String pre(){


    }

    public String in(){

    }

    public String post(){

    }

    public int height(){

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


