package io.github.mnizarzr;

public class Makanan extends Hidangan {
    @Override
    public String disantap() {
        return this.getNamaHidangan() + " dimakan";
    }
}
