package ThemeFactory;

public class LightTheme implements ITheme {

    @Override
    public String getTextColor() {
        return "black";
    }

    @Override
    public String getBgrColor() {
        return "white";
    }
}

