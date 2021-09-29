package task4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Demo {
public static void main(String[] args) {
	 try {
	        InputStream sourceStream = new FileInputStream("files/file.txt");
	        byte[] sourceArray = new byte[sourceStream.available()];
	        sourceStream.read(sourceArray);
	 
	        byte key = '5';
	 
	        for (int i = 0; i < sourceArray.length; i++) {
	            sourceArray[i] = (byte) (sourceArray[i] ^ key);
	        }
	 
	        for (int i = 0; i < sourceArray.length; i++) {
	            sourceArray[i] = (byte) (sourceArray[i] ^ key);
	        }
	 
	        FileOutputStream fileOutputStream = new FileOutputStream("files/file1.txt");
	        fileOutputStream.write(sourceArray, 0, sourceArray.length);
	 
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
}
}
