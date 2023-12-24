import AbstractFactory.HotDrinkMachine;
import AbstractFactory.IHotDrink;
import Point.Point;
import Point.CoordinateSystem;
import ThemeFactory.ReplaceableThemeFactory;
import ThemeFactory.TrackingThemeFactory;

public class Main {

    private static void getPoint() {
        Point p1 = new Point(2,3, CoordinateSystem.Cartesian);
        Point origin = Point.origin();

        Point p2 = Point.Factory.newCartesianPoint(1,2);
    }

    private static void getTheme() {
        var factory = new TrackingThemeFactory();
        var theme = factory.createTheme(true);
        var theme2 = factory.createTheme(false);
        System.out.println(factory.info());
        // Dark theme
        // Light theme


        // replacement
        var factory2 = new ReplaceableThemeFactory();
        var magicTheme = factory2.createTheme(true);
        System.out.println(magicTheme.getValue().getBgrColor()); // dark gray
        factory2.replaceTheme(false);
        System.out.println(magicTheme.getValue().getBgrColor()); //white
    }

    private static void getAbastractFactory() {
        var machine = new HotDrinkMachine();

        IHotDrink drink = machine.makeDrink();
        drink.consume();
    }

    public static void main(String[] args) {
        // getPoint();
        // getTheme();
        getAbastractFactory();
    }
}