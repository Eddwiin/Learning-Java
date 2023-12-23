package Point;

import java.util.ArrayList;

public class LineToPointAdapter extends ArrayList<Point> {
    private static int count = 0;

    public LineToPointAdapter(Line line) {
        int left = Math.min(line.getStart().getX(), line.getEnd().getX());
        int right = Math.max(line.getStart().getX(), line.getEnd().getX());
        int top = Math.min(line.getStart().getY(), line.getEnd().getY());
        int bottom = Math.max(line.getStart().getY(), line.getEnd().getY());

        int dx = right - left;
        int dy = line.getEnd().getY() - line.getStart().getY();

        if (dx == 0)
        {
            for (int y = top; y <= bottom; ++y)
            {
                add(new Point(left, y));
            }
        } else if (dy == 0)
        {
            for (int x = left; x <= right; ++x)
            {
                add(new Point(x, top));
            }
        }
    }
}
