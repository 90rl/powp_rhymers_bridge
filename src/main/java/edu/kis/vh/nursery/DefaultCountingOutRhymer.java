package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
 
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	private IntArrayStack intArrayStack;
	

    
    public DefaultCountingOutRhymer() {
        intArrayStack = new IntArrayStack();
    }
    
    public int getTotal() {
        return intArrayStack.getTotal();
    }
    
    public void countIn(int in) {
        intArrayStack.countIn(in);
    }
    boolean isFull() {
        return intArrayStack.isFull();
    }

    int peekaboo() {
        return intArrayStack.peekaboo();
    }
    
    int countOut() {
        return intArrayStack.countOut();
    }
    
    boolean callCheck() {
        return intArrayStack.callCheck();
    }
    
}
