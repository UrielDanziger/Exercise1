import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws IOException {
        	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       	int choice = 3;
        boolean exit = false;
        String path;
        Encryptor Myencryptor  = new Encryptor();
        while (exit != true)
        	{
        	System.out.println("1 - for encryption");
        	System.out.println("2 - for decryption");
        	System.out.println("0 - for exiting");
        	choice = Integer.parseInt(reader.readLine());
        	try{	
        	switch (choice)
		       	{
		        	case 1:
		        	{
		        		System.out.println("insert the path of the file for encryption");
		                 path = reader.readLine();
		                 Myencryptor.encrypt(path);
		        		//Todo encrypt
		        		break;
		        	}
		        	case 2:
		        	{
		        		System.out.println("insert the path of the file for decryption");
		                 path = reader.readLine();
		                 System.out.println("insert the key of for the decryption");
		                 int key = Integer.parseInt(reader.readLine());
		                 Myencryptor.decrypt(path,key);
		        		//Todo decrypt
		        		break;
		        	}
		        	case 0:
		        	{
		        		exit = true;
		        		break;
		        	}
		        	default:
		        	{
		        		System.out.println("try again");
		        		break;
		        	}
		       	}}
        		catch(Exception ex){
        			System.out.println(ex.getMessage() + "/n or something with the pathfile");

        		}
        	}
        }
           
    };
