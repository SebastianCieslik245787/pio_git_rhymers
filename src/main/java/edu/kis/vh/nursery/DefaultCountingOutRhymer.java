package edu.kis.vh.nursery;
/*
    The DefaultCountingOutRhymer class is used to count out rhymers.
*/
public class DefaultCountingOutRhymer {
    private static final int EMPTY = -1;
    private final int MAX_SIZE = 12;
    private final int FULL = MAX_SIZE - 1;

    private static final int DEFAULT = -1;


    private final int[] numbers = new int[MAX_SIZE];
    /*
        getTotal method returns value of elements in array numbers.
        variable total is a number of rhymers in array.
     */
    public int getTotal() {
        return total;
    }

    private int total = EMPTY;
    /*
        countIn method inserts value into numbers array after the last element, if array isn't full.
        argument in is a value that will be inserted into array as the next element.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /*
        callCheck is a method that returns true, if array number is empty, otherwise returns false.
     */
    public boolean callCheck() {
        return total == DEFAULT;
    }
    /*
        isFull is a method that returns true, if array number is full.
    */
    public boolean isFull() {
        return total == FULL;
    }
    /*
        peekaboo is a method that returns value of the last inserted element into number's array, if array isn't empty, otherwise returns DEFAULT value.
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }
    /*
        countOut method is returning last inserted elements and reduce last element, if array numbers isn't empty, otherwise returns EMPTY value.
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
