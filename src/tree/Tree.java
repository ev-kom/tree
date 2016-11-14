package tree;

import java.util.Objects;

/**
 * Created by EKomarov on 11.10.2016.
 */
public class Tree {
    private Tree_Node root;
    private Tree_Node leftNode;
    private Tree_Node rightNode;

    void putNode(Tree_Node newNode){
        if (root == null){ root = newNode; return; }
        Tree_Node rootNode = root;
        if (rootNode.getValue() <= newNode.getValue()){
            if (rootNode.getRight() == null || Objects.equals(rootNode.getRight().getValue(), newNode.getValue())){rootNode.setRight(newNode);} else {
                rootNode = rootNode.getRight();
                putNode(newNode);
            }
        } else {
            if (rootNode.getLeft() == null || Objects.equals(rootNode.getLeft().getValue(), newNode.getValue())){rootNode.setLeft(newNode);} else {
                rootNode = rootNode.getLeft();
                putNode(newNode);
            }
        }
    }

    Tree(Tree_Node root){

    }
}
