package secondPart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferReader {

	public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        
        BufferedReader br = new BufferedReader(new FileReader("D:\\LAB01_2.txt"));
              String currentLine;
              
        while((currentLine = br.readLine()) != null){
            System.out.println(currentLine);
        }
        br.close();
        long endTime = System.currentTimeMillis();
        long time= endTime-startTime;
        
        System.out.println("The time of the BufferedReader: "+ time+"Ms");

	}

}
