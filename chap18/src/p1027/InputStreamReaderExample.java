package p1027;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readerChardNo;
		char[] cbuf = new char[100];
		while((readerChardNo=reader.read(cbuf))!= -1) {
			String data = new String(cbuf, 0, readerChardNo);
			System.out.println(data);
		}
		
		reader.close();
		is.close();

	}

}
