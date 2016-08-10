import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.omg.CORBA.INTERNAL;



public class Encryptor { 
	
	public int encrypt(String path) throws IOException {
		
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;
		Random rand = new Random();
		int  key = rand.nextInt(100) + 1;
		try  {
	        		fileInput = new FileInputStream(path);
	                fileOutput = new FileOutputStream(path+".encrypted");
	        			            
	                   
	                int data;

	                while ((data = fileInput.read()) != -1) {
	                	if(data + key > Integer.MAX_VALUE)
	                	{	
	                		fileOutput.write( (Integer.MAX_VALUE -data) + key);
	                	}
	                	else 
	                	{
	                		fileOutput.write(data+key);
	                	}
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
	public void decrypt(String path) {
	}
};