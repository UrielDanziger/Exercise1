
public class CaesarAlgorithm {
	public int encrypt (int value, int key)
	{
		if(value + key > Integer.MAX_VALUE)
    	{	
    		return( (Integer.MAX_VALUE -value) + key);
    	}
    	else 
    	{
    		return(value+key);
    	}
	}
	public int decrypt (int value , int key)
	{
		if(value - key < Integer.MIN_VALUE)
    	{	
    		return(Integer.MAX_VALUE - (key -value) );
    	}
    	else 
    	{
    		return(value-key);
    	}
		
	}
	
};
