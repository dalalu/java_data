package p1020;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
			"D:\\java_data\\chap18\\src\\p1020\\PointClass.java");
			
			int data;
			while( (data = fis.read())!= -1) {
				System.out.write(data);
			}
			fis.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
