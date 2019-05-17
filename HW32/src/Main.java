
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);
        myLinkedList.add(60);
        Stream<Integer> myStream = new Stream<>(myLinkedList);
        myStream.filter(x -> x > 0).map(x -> (char)(x + 'a')).forEach(x -> System.out.println(x));
    }
}