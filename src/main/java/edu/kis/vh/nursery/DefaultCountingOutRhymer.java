package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] numbers = new int[12];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++currentIndex] = in;
    }

    public boolean callCheck() {
        return currentIndex == -1;
    }

    public boolean isFull() {
        return currentIndex == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[currentIndex];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[currentIndex--];
    }
    public int getTotal() {
        return total;  
    }

}
