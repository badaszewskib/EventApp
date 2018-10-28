package Model;

import java.util.List;
import Model.Node;

public class Event extends Node {

    private EventInfo _info;

    public Event(Node parent, List<Node> children, EventInfo info){
        super(parent, children);
        _info = info;
    }

    public EventInfo get_info() { return _info; }
}
