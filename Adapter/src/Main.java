import Point.Line;
import Point.VectorObject;
import Point.VectorRectangle;
import Point.LineToPointAdapter;
import java.util.ArrayList;

public class Main {
    private static ArrayList<VectorObject> vectorObjects = new ArrayList<VectorObject>();

    private static void getPoint() {
        Main.vectorObjects.add(new VectorRectangle(1, 1, 10, 10));
        Main.vectorObjects.add(new VectorRectangle(3, 3, 6, 6));

        for(VectorObject vo : vectorObjects) {
           for(Line line : vo) {
               var adapter = new LineToPointAdapter(line);
               adapter.forEach(item -> System.out.println("."));
           }
        }
    }

    public static void main(String[] args) {
        getPoint();
    }
}