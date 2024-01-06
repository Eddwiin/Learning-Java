import structural.Circle;
import structural.GraphicObject;
import structural.Square;

public class Main {
    static void printStructural() {
        var drawing = new GraphicObject();
        drawing.setName("MyDrawing");

        var square1 = new Square();
        square1.setColor("Red");
        var circle1 = new Circle();
        circle1.setColor("Yellow");
        drawing.add(square1);
        drawing.add(circle1);

        var group = new GraphicObject();
        var square2 = new Square();
        square1.setColor("Blue");
        var circle2 = new Circle();
        circle1.setColor("Blue");

        drawing.add(group);

        System.out.println(drawing);
    }

    public static void main(String[] args) {
        printStructural();
    }
}