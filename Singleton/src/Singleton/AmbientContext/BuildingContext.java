package Singleton.AmbientContext;

import java.util.Stack;

public final class BuildingContext implements AutoCloseable {
    private int wallHeight = 0;
    private int wallThickness = 300;

    private static Stack<BuildingContext> stack
            = new Stack<BuildingContext>();

    static {
        stack.push(new BuildingContext(0));
    }

    public BuildingContext(int wallHeight) {
        this.wallHeight = wallHeight;
        stack.add(this);
    }

    public static BuildingContext getCurrent() {
        return stack.peek();
    }

    public int getWallHeight() {
        return this.wallHeight;
    }

    @Override
    public void close() throws Exception {
        if((long) stack.size() > 1) {
            stack.pop();
        }
    }
}
