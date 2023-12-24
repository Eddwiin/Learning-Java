package ThemeFactory;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class ReplaceableThemeFactory {
    private List<Ref<ITheme>> themes = new ArrayList<>();

    private ITheme createThemeImpl(boolean dark) {
        return dark ? new DarkTheme() : new LightTheme();
    }

    public Ref<ITheme> createTheme(boolean dark) {
        ITheme theme = createThemeImpl(dark);
        Ref<ITheme> r = new Ref<>(theme);
        themes.add(r);
        return r;
    }

    public void replaceTheme(boolean dark) {
        for (var reference : themes) {
            if (reference.getValue() != null) {
                reference.setValue(createThemeImpl(dark));
            }
        }
    }
}
