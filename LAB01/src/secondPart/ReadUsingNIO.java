package secondPart;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadUsingNIO {

	public static void main(String[] args) {
		long startTime1 = System.currentTimeMillis();
		try {
			//RandomAccessFile aFile = new RandomAccessFile("D:\\LAB01_2.txt",
			//		"r");
			
			RandomAccessFile aFile = new RandomAccessFile("temp.bin",
					"r");
			
			FileChannel inChannel = aFile.getChannel();
			long fileSize = inChannel.size();
			ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
			inChannel.read(buffer);
			buffer.flip();
			for (int i = 0; i < fileSize; i++) {
				System.out.print((char) buffer.get());
			}
			inChannel.close();
			aFile.close();
		} catch (IOException exc) {
			System.out.println(exc);
			System.exit(1);
		}

		long endTime1 = System.currentTimeMillis();
		long time1 = endTime1 - startTime1;

		System.out.println("The time of the BufferedReader: " + time1+"Ms");
	}

}
