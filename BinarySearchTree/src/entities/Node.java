package entities;

public class Node {
    private Integer value;
    public Node left,right;
    public Node(Integer value) {
        this.value = value;
        this.left = this.right = null;
    }

    public Integer getKey() {
        return value;
    }
}
