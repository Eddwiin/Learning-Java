package Point;

public class Point {
    private double x, y;
    private CoordinateSystem cs;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(float a, float b, CoordinateSystem cs) {
        switch (cs) {
            case CoordinateSystem.Cartesian:
                x = a * Math.cos(b);
                y = a * Math.sin(b);
                break;
            default:
                x = a;
                y = b;
                break;
        }
    }

    public static class Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }
    }

    public static Point origin() {
        return new Point(0,0);
    }

    public static Point origin2() {
        return new Point(0,0);
    }

    public static Point newCartesianPoint(double x, double y){
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return null;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
