package personHeritance;

public class DeepCopyExtensions {

    public static <T> T deepCopy(IDeepCopyable<T> item) {
        return item.deepCopy();
    }

    public static <T extends Person & IDeepCopyable<T>> T deepCopy(T person) {
        return person.deepCopy();
    }
}
