package CorejavaExamples;

import java.io.*;

public class DeepCopyExample {
	public static void main(String[] args) {
        // Original object
        Person originalPerson = new Person("John", new Address("123 Main St"));

        // Deep copy using serialization
        Person deepCopyPerson = deepCopy(originalPerson);

        // Modifying the deep copy
        deepCopyPerson.setName("Jane");
        deepCopyPerson.getAddress().setStreet("456 Side St");

        // Original object remains unchanged
        System.out.println("Original Person: " + originalPerson.toString() + originalPerson.getName());
        System.out.println("Deep Copy Person: " + deepCopyPerson.toString()+ deepCopyPerson.getName());
    }

    @SuppressWarnings("unchecked")
    private static <T> T deepCopy(T object) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream out = new ObjectOutputStream(bos)) {

            // Writing the object to a byte array
            out.writeObject(object);

            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream in = new ObjectInputStream(bis)) {

                // Reading the object from the byte array
                return (T) in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Deep copy failed", e);
        }
    }
}
