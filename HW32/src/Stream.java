import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Stream<T> {
    LinkedList<T> linkedList;

    public Stream(LinkedList<T> list) {
        this.linkedList = list;
    }

    public Stream() {
        linkedList = new LinkedList<>();
    }

    public void forEach(Consumer<T> consumer) {
        Iterator<T> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            consumer.accept(iterator.next());
        }
    }

    public Stream<T> filter(Predicate<T> predicate) {
        Stream<T> tempStream = new Stream<>();
        Iterator<T> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            T tempValue = iterator.next();
            if (predicate.test(tempValue)) {
                tempStream.linkedList.add(tempValue);
            }
        }
        return tempStream;
    }

    public <R> Stream<R> map(Function<T, R> function) {
        Stream<R> tempStream = new Stream<>();
        Iterator<T> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            T tempValue = iterator.next();
            tempStream.linkedList.add(function.apply(tempValue));
        }
        return tempStream;
    }
}
