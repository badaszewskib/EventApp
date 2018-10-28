package Model;

import java.util.List;

public abstract class Node {

    private Node _parent;
    private List<Node> _children;

    public Node(Node parent, List<Node> children){
        _parent = parent;
        _children = children;
    }

}
