package EX6;

public class Clinder extends Circle {
    double height = 1.0;

    public Clinder() {
        super();
    }

    public Clinder(double height) {
        super();
        this.height = height;
    }

    public Clinder(double height, double raduis) {
        super(raduis);
        this.height = height;
    }

    public Clinder(double height, double raduis, String color) {
        super(raduis, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(raduis, 2) * height;
    }
}