package secondPart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class ReadUsingMappedFileMemory {

	public static void main(String[] args) throws IOException {

		// Create file object

		long startTime2 = System.currentTimeMillis();
		File file = new File("D:\\LAB01_2.txt");

		// Get file channel in readonly mode
		FileChannel fileChannel = new RandomAccessFile(file, "r").getChannel();

		// Get direct byte buffer access using channel.map() operation
		MappedByteBuffer buffer = fileChannel.map(
				FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());

		// the buffer now reads the file as if it were loaded in memory.
		System.out.println(buffer.isLoaded()); // prints false
		System.out.println(buffer.capacity()); // Get the size based on content
												// size of file

		// You can read the file from this buffer the way you like.
		for (int i = 0; i < buffer.limit(); i++) {
			System.out.print((char) buffer.get()); // Print the content of file
		}

		long endTime2 = System.currentTimeMillis();
		long time2 = endTime2 - startTime2;

		System.out.println("The time of the NIO Memory Mapped: " + time2+"Ms");
	}

}
