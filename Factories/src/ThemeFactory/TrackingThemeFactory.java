package ThemeFactory;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class TrackingThemeFactory {
    private final List<WeakReference<ITheme>> themes
            = new ArrayList<>();

    public ITheme createTheme(boolean dark) {
        ITheme theme = dark ? new DarkTheme() : new LightTheme();
        this.themes.add(new WeakReference<ITheme>(theme));
        return theme;
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        for (WeakReference<ITheme> reference : this.themes) {
            ITheme theme = reference.get();
            if (theme != null) {
                boolean dark = theme instanceof DarkTheme;
                sb.append(dark ? "Dark" : "Light").append(" theme").append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

}
