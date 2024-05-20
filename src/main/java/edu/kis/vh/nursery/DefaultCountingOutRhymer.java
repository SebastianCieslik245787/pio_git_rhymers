package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    static final int EMPTY = -1;
    static final int SIZE = 12;
    static final int FULL = SIZE - 1;    


    private int[] numbers = new int[SIZE];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
