package lambda.marker_hack;

import java.io.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        Comparator<String> nonSerializable =
                (a, b) -> a.compareTo(b);

        Comparator<String> serializable =
                (Comparator<String> & Serializable) (a, b) -> a.compareTo(b);

        Comparator<String> serializableAndCloneable =
                (Comparator<String> & Serializable & Cloneable) (a, b) -> a.compareTo(b);

        try (ObjectOutputStream dos = new ObjectOutputStream(new ByteArrayOutputStream(1024))) {
            System.out.println("Writing serializable");
            dos.writeObject(serializable);

            System.out.println("Writing non serializable");
            dos.writeObject(nonSerializable);

            System.out.println("Done");
            dos.flush();
        }
    }
}
