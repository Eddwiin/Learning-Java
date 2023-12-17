package Singleton.AmbientContext;

import java.util.ArrayList;
import java.util.List;

public class Building {
    public final List<Wall> walls = new ArrayList<>();

    public List<Wall> getWalls() {
        return walls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Wall wall : walls) {
            sb.append(wall.toString());
        }
        return sb.toString();
    }

}
