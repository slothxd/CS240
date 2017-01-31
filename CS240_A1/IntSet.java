
public class IntSet<T> {

	private Node<T> head;
	private int size;

public IntSet()
{
	head = new Node<T>(null, null);
    size = 0;
}


public boolean contain(T element)
{
        if (head.getNext() != null) {
            Node<T> current = head.getNext();
            while (current != null) {
                if (current.getValue().equals(element)) {
                    return true;
                }
                current = current.getNext();
            }
        }
        return false;
}

public void remove(int x)
{
        if (head.getNext() != null) {
            Node<T> current = head.getNext();
            Node<T> previous = head;
            while (current != null) {
                if (current.getValue().equals(x)) {
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    size--;

                }
                previous = previous.getNext();
                current = current.getNext();
            }
        }

    }

public void addElement(T value)
{
        if (!contain(value)) {
            head.setNext(new Node<T>(value, head.getNext()));
            size++;

        }
}


int size()
{
	return size;
}


public boolean subsetOf(IntSet<T> GivenSet)
{
        if (size == GivenSet.size) {
            Node<T> currentNode = GivenSet.head.getNext();
            for (int i = 0; i < GivenSet.size(); i++) {
                if (!contain(currentNode.getValue())) {
                    return false;
                }
            }
            return true;
        }
        return false;
}


public boolean isEqual(IntSet<T> GivenSet)
{
    if (size == GivenSet.size) {
        Node<T> currentNode = GivenSet.head.getNext();
        for (int i = 0; i < GivenSet.size(); i++) {
            if (!contain(currentNode.getValue())) {
                return false;
            }
        }
        return true;
    }
    return false;
}


public IntSet union(IntSet<T> givenSet)
{
    IntSet<T> union = new IntSet<T>();

    Node<T> current = head;
    for (int i = 0; i < size; i++) {
        current = current.getNext();
        union.addElement(current.getValue());
    }

    current = givenSet.head;
    for (int i = 0; i < givenSet.size; i++) {
        current = current.getNext();
        if (!contain(current.getValue())) {
            union.addElement(current.getValue());
        }
    }
    return union;
}

public IntSet intersection(IntSet<T> givenSet)
{
	IntSet<T> intersection = new IntSet<T>();

	Node<T> current = givenSet.head;
	for (int i = 0; i < givenSet.size; i++) {
	    current = current.getNext();
	    if (contain(current.getValue())) {
	        intersection.addElement(current.getValue());
	    }
	}
	return intersection;
	}


public IntSet complement(IntSet<T> givenSet)
{
        IntSet<T> complement = new IntSet<T>();

        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            current = current.getNext();
            if (!givenSet.contain(current.getValue())) {
                complement.addElement(current.getValue());
            }
        }
        return complement;
    }

public String toString()
{
    if (size == 0) {
        return "{ }";
    } else {
        String res = "{";
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            current = current.getNext();
            if (i < size - 1) {
                res += current.getValue().toString() + ", ";
            } else {
                res += current.getValue().toString() + "}";
            }
        }
        return res;
    }
}
}

