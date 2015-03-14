import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainExtern {

	public static void main(String[] args) throws ParseException,
			FileNotFoundException, IOException, ClassNotFoundException {

		// PC - Windows
		// FileOutputStream f = new FileOutputStream("D:\\person.ext");
		// PC - Mac
		FileOutputStream f = new FileOutputStream(
				"/Users/mehdi/git/EffectiveJava/LAB01/person.ext");

		ObjectOutputStream oos = new ObjectOutputStream(f);

		PersonExter person = new PersonExter("Mehdi", "Ben Daly Hassen",
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
						.parse("1990-05-18 19:19:19"), 25);
		person.writeExternal(oos);
		oos.close();

		// read part

		PersonExter p = new PersonExter();

		// PC - Windows

		// ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
		// "D:\\person.ext"));
		// PC - Mac

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"/Users/mehdi/git/EffectiveJava/LAB01/person.ext"));

		p.readExternal(ois);

		System.out.println("After  externalizing person \nFirstname: "
				+ p.getFirstName() + "\nLastname: " + p.getLastName()
				+ "\nBirthdate: " + p.getBirthday() + "\nAge: " + p.getAge());
		ois.close();

	}

}
