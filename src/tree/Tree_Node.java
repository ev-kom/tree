package tree;

/**
 * Created by EKomarov on 11.10.2016.
 */

public class Tree_Node {
    Integer value;
    Tree_Node left;
    Tree_Node right;

    Tree_Node (Integer value, Tree_Node left, Tree_Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Tree_Node getLeft() {
        return left;
    }

    public void setLeft(Tree_Node left) {
        this.left = left;
    }

    public Tree_Node getRight() {
        return right;
    }

    public void setRight(Tree_Node right) {
        this.right = right;
    }
}
