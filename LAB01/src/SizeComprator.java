import java.io.File;

public class SizeComprator {

	public static void main(String[] args) {

		File fileSer = new File("D:\\person.ser");
		File fileExt = new File("D:\\person.ext");

		double byteSer = fileSer.length();
		double byteExt = fileExt.length();

		System.out.println("Size of fyle using SERIALIZABLE is: " + byteSer
				+ " bytes");
		System.out.println("Size of fyle using EXTERNELIZABLE is: " + byteExt
				+ " bytes");

	}

}
