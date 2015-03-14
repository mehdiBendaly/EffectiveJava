import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Serializer {

	Writer writer = null;

	public static void main(String[] args) throws ParseException {
		Serializer serializer = new Serializer();
		serializer.serializePerson("Mehdi", "Ben Daly Hassen",
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("1990-05-18 19:19:19"), 25);

	}

	public void serializePerson(String firstName, String lastName,
			Date birthday, int age) {

		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setBirthday(birthday);
		person.setAge(age);

		try {

//			PC - Windows		
//			FileOutputStream fout = new FileOutputStream("D:\\person.ser");
//			PC - Mac
			FileOutputStream fout = new FileOutputStream("/Users/mehdi/git/EffectiveJava/LAB01/person.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(person);
			oos.close();
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
