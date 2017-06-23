package Module8.homework;

/**
 * Created by user on 08.06.2017.
 */
public class Node <T> {

    private T data;
    private Node <T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}
