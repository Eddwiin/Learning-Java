package ThemeFactory;

public class DarkTheme implements ITheme {

    @Override
    public String getTextColor() {
        return "white";
    }

    @Override
    public String getBgrColor() {
        return "dark gray";
    }
}