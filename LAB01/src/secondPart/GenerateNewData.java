package secondPart;

import java.io.RandomAccessFile;
import java.util.Random;

public class GenerateNewData {

	public static String generateString(Random rng, String characters,
			int length) {
		char[] text = new char[length];
		for (int i = 0; i < length; i++) {
			text[i] = characters.charAt(rng.nextInt(characters.length()));
		}
		return new String(text);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Random rnd = new Random();

		String str = generateString(rnd, "abcdefghijklmnopqrstuvwxyz0123456789", 1024);

		try {
			int randomNum = 1 + (int)(Math.random() * ((999 - 1) + 1));
			RandomAccessFile f = new RandomAccessFile("temp.bin", "rw");
			f.writeUTF(str);
			f.setLength(1024 * 1024 * randomNum);
			System.out.println("The size of genrated file is: " + randomNum + "MB" );

		} catch (Exception e) {
			System.err.println(e);
		} finally {
			System.out.println("The genearted string is:");
			System.out.println(str);
		}
	}

}
