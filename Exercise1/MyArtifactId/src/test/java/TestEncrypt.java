import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class TestEncrypt {

	@Test
	public void test() throws IOException {
		Encryptor TestingObject = new Encryptor();
		int a = TestingObject.encrypt("D:\\Downloads\\document.txt");
		TestingObject.decrypt("D:\\Downloads\\document.txt.encrpyted",a);
	}

}
