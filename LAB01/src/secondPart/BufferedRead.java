package secondPart;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedRead {
	protected static String source = "temp.bin";

	public static void main(String[] args) {
		try {
			String ligne;
			BufferedReader fichier = new BufferedReader(new FileReader(source));

			while ((ligne = fichier.readLine()) != null) {
				System.out.println(ligne);
			}

			fichier.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
