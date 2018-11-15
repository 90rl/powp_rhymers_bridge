package edu.kis.vh.nursery.collections;

public class IntLinkedList extends StackImplementation {

	private Node last;
	private int size;


	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getTotal() {
		return size;
		
	}
    public Node getLast() {
        return last;
    }
    
    public void setLast(Node last) {
        this.last = last;
    }


	}
