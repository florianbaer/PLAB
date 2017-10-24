package ch.hslu.plab.sw05;

public final class Square extends Shape {
    private static final int NUMBER_OF_SIDES = 4;
    private int sideLength;

    protected Square(int x, int y, int sideLength) {
        super(x, y);
        this.setSideLength(sideLength);
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getPerimeter() {
        return NUMBER_OF_SIDES * getSideLength();
    }

    @Override
    public int getArea() {
        return getSideLength() * getSideLength();
    }
}
