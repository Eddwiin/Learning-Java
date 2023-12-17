package Singleton.AmbientContext;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        Point point = new Point(10, 20);
        System.out.println(point.toString());
    }
}