package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int EMPTY = -1;
    private final int MAX_SIZE = 12;
    private final int FULL = MAX_SIZE - 1;

    private static final int DEFAULT = -1;


    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
