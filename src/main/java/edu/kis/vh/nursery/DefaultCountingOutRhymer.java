package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    static int EMPTY = -1;
    static int FULL = 11;
    static int SIZE = 12;


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
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
