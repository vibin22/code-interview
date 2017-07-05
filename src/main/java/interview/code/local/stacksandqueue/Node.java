package interview.code.local.stacksandqueue;

/**
 * Created by vibinramakrishnan on 7/4/17.
 */

public class Node {
    public Node above;
    public Node below;
    public int value;
    public Node(int value) {
        this.value = value;
    }
}