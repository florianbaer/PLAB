package ch.hslu.plab.sw05;

public final class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.setDiameter(diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public int getPerimeter() {
        return (int) Math.round(2 * Math.PI * this.diameter);
    }

    @Override
    public int getArea() {
        return (int) Math.round(Math.PI * (this.diameter * this.diameter));
    }
}

