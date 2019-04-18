public class Node {
    private Node list;
    private char value;

    Node(char value, Node list) {
        this.value = value;
        this.list = list;

    }

    Node getList() {
        return list;
    }

    char getValue() {
        return value;
    }




}