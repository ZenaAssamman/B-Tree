public class Node {
    int value; // aktuelle knote
    Node rightNode; // jedes Element hat ein Referenz zu richte und linke knote
    Node leftNode;

    public Node(int value) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }
}
