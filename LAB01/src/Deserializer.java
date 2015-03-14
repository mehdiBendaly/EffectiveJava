import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {

	public static void main(String[] args) {

		Person p = null;
		try {
			FileInputStream fileIn = new FileInputStream("D:\\person.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			p = (Person) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("---- Deserialized Person ----");
		System.out.println("Firstname: " + p.firstName);
		System.out.println("Lastname: " + p.lastName);
		System.out.println("Birthdate: " + p.birthday.toString());
		System.out.println("Age: " + p.age);
	}

}
