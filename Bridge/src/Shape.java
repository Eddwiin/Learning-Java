public abstract class Shape {
    protected IRenderer renderer;

    public Shape(IRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}
