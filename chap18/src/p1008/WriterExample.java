package p1008;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception {
		
		
		Writer writer = new FileWriter("c:/Temp/test.txt");
		char[] data = "홍길동". toCharArray();
		for(int i=0; i<data.length; i++) {
			writer.wait(data[i]);
		}
		writer.flush();
		writer.close();

	}

}
