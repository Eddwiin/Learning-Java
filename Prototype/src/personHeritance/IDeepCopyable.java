package personHeritance;

import java.lang.reflect.InvocationTargetException;

public interface IDeepCopyable<T> {
    public void copyTo(T target);

    default T deepCopy() {
        try {
            T t = (T) getClass().getDeclaredConstructor().newInstance();
            copyTo(t);
            return t;
        } catch (Exception e) {
            e.printStackTrace(); // Gestion simple de l'exception
            return null;
        }
    }
}
