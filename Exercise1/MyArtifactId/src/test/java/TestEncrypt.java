import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class TestEncrypt {

	@Test
	public void test() throws IOException {
		Encryptor TestingObject = new Encryptor();
		TestingObject.encrypt("D:\\Downloads\\document.text");
		TestingObject.decrypt("D:\\Downloads\\document.text.encrpyted");
	}

}
