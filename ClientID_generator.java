import java.security.SecureRandom;
//This imports the 'SecureRandom' class
import java.util.Random;

public class clientIDGenerator {
    
    private static final String CHARSET_AZ_09="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    public static String randomalphanumeric(int length) {
        
        char[] characterSet = CHARSET_AZ_09.toCharArray();
        Random random = new SecureRandom();
        //Creates an instance of 'SecureRandom' for generating random numbers
        char[] result = new char[length];
        //Creates a charcter arry to hold the resulting random randomalphanumeric String
        
        for (int i=0; i<length; i++)
        {
            
            int randomCharIndex=random.nextInt(characterSet.length);
            //Generates a random index within the bounds of the 'characterSet' Array
            result[i]=characterSet[randomCharIndex];
            //Assign a randomly choosen charcter from 'characterSet' to the result array
        }
        
        return new String(result);
        
        
        
    }
    
    public static void main(String[] args)
    {
        
        int desiredLength=32;
        String alphanumericSrtring=randomalphanumeric(desiredLength);
        System.out.println("Generated ClientID of alphanumeric string of 32 bit:" + alphanumericSrtring);
    }
    
    
}
