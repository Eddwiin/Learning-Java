package structural;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GraphicObject {
    private String name = "Group";
    private String color;
    private Supplier<List<GraphicObject>> children = ArrayList::new;


    private void print(StringBuilder sb, int depth) {
        sb.append("*".repeat(depth))
                .append((color == null || color.trim().isEmpty()) ? "" : color + " ")
                .append(name)
                .append("\n");
        for (GraphicObject child : children.get()) {
            child.print(sb, depth + 1);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void add(GraphicObject obj) {
        this.children.get().add(obj);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }
}
