import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class Encryption {

	@Test
	public void test() throws IOException {
		Encryptor myEncryptor = new Encryptor();
		int key = myEncryptor.encrypt("D:\\Downloads\\document.txt");
		myEncryptor.decrypt("D:\\Downloads\\document.txt.encrypted", key);
	}

}
