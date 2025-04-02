package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int rejectedCount = 0;

    public int reportRejected() {
        return rejectedCount;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            rejectedCount++;
        else
            super.countIn(in);
    }
}
