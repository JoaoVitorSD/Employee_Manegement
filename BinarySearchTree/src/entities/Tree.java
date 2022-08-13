package entities;


public class Tree {
    private Node firtsNode;
    public Integer size;

    public Tree() {
        this.firtsNode = null;
        this.size = 0;
    }

    public void add(Integer key) {
        if(firtsNode == null){
            firtsNode = new Node(key);
            size++;
            return;
        }
        Node aux = firtsNode;
        while (aux != null) {
            if(key<aux.getKey()) {
                if(aux.left == null){
                    aux.left = new Node(key);
                    break;
                }else{
                    aux = aux.left;
                }
            }else{
                if(aux.right == null){
                    aux.right = new Node(key);
                    break;
                }else{
                    aux = aux.right;
                }
            }
        }
        size++;
    }
    public void print(){
        walk(firtsNode);
    }
    private void walk(Node walk){
        if(walk == null)   {
            return;
        }
        walk(walk.left);
        System.out.println(walk.getKey());
        walk(walk.right);
    }
}
