import static org.junit.Assert.*;

import org.junit.Test;


public class TestEncrypt {

	@Test
	public void test() {
		Encryptor TestingObject = new Encryptor();
		TestingObject.encrypt();
		TestingObject.decrypt();
	}

}
