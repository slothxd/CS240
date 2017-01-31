public class Node <T>{
    private T element;
    private Node<T> next;


    public Node(T s, Node<T> n) {
        element = s;
        next = n;
    }

 
    public T getValue() {
        return element;
    }


    public Node<T> getNext() {
        return next;
    }


    public void setElement(T newElem) {
        element = newElem;
    }


    public void setNext(Node<T> next){
        this.next = next;
    }
}