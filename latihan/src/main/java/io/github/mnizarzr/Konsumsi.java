package io.github.mnizarzr;

public class Konsumsi<M, I> {

    private M m;
    private I i;

    public M getM() {
        return m;
    }

    public I getI() {
        return i;
    }

    public void setKonsumsi(M m, I i) {
        this.m = m;
        this.i = i;
    }
}
