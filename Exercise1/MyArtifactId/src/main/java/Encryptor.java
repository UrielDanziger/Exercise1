import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.omg.CORBA.INTERNAL;



public class Encryptor { 
	public CaesarAlgorithm algorthim;
	
	public int encrypt(String path) throws IOException {
		algorthim  = new CaesarAlgorithm();
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;
		Random rand = new Random();
		int  key = rand.nextInt(100) + 1;
		try  {
	        		fileInput = new FileInputStream(path);
	                fileOutput = new FileOutputStream(path+".encrypted");
	        			            
	                   
	                int data;

	                while ((data = fileInput.read()) != -1) {
	                	fileOutput.write(algorthim.encrypt(data, key));
	                }
	            }
	        catch (IOException e)
	            {
	                System.out.println("Error message: " + e.getMessage());
	            }
	         
	        finally {
	        		if (fileInput != null) {
	        			fileInput.close();
	            }
	            if (fileOutput != null) {
	            	fileOutput.close();
	            }
	        }
		return key;
	}
	public void decrypt(String path, int key) throws IOException {
		algorthim  = new CaesarAlgorithm();
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;
		Random rand = new Random();
		try  {
	        		fileInput = new FileInputStream(path);
	                fileOutput = new FileOutputStream(path+".decrypted");
	        			            
	                   
	                int data;

	                while ((data = fileInput.read()) != -1) {
	                		fileOutput.write(algorthim.decrypt(data, key));
	                }
	            }
	        catch (IOException e)
	            {
	                System.out.println("Error message: " + e.getMessage());
	            }
	         
	        finally {
	        		if (fileInput != null) {
	        			fileInput.close();
	            }
	            if (fileOutput != null) {
	            	fileOutput.close();
	            }
	        }
	}
};