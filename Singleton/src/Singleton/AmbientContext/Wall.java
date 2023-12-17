package Singleton.AmbientContext;

public class Wall {
    public Point start, end;
    public int height;

    public static final int USE_AMBIENT = Integer.MIN_VALUE;

    public Wall(Point start, Point end) {
        this.start = start;
        this.end = end;
        // Elevation is commented out since it is not defined in the provided code
        // Elevation = BuildingContext.Elevation;
        height = BuildingContext.getCurrent().getWallHeight();
    }

    @Override
    public String toString() {
        return "Wall{" +
                "start=" + start +
                ", end=" + end +
                ", height=" + height +
                '}';
    }
}
