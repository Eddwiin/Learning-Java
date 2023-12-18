package CopyThroughSerialization;

import java.io.*;

public class ExtensionMethods {

    public static <T> T deepCopy(T self) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(self);
            objectOutputStream.flush();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object copy = objectInputStream.readObject();

            objectOutputStream.close();
            objectInputStream.close();

            @SuppressWarnings("unchecked")
            T typedCopy = (T) copy;
            return typedCopy;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); // Gestion simple de l'exception
            return null;
        }
    }

}