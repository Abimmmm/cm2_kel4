public class Node {
    Kendaraan data;
    Node prev, next;

    public Node(Kendaraan data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
