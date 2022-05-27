package p1001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:Temp/test.txt");
		byte[] data = "자바 힘들고 밥먹고 나면 너무 졸려요".getBytes();
			os.write(data);
			os.flush();
			os.close();

		}
		
	}


