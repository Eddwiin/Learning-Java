package Point;

import java.util.Objects;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    protected boolean equals(Line other) {
        return Objects.equals(start, other.start) && Objects.equals(end, other.end);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return equals((Line) obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
