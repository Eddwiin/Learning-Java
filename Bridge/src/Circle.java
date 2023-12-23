public class Circle extends Shape {
    private float radius;

    public Circle(IRenderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(this.radius);
    }

    @Override
    public void resize(float factor) {
        radius *= factor;
    }
}
