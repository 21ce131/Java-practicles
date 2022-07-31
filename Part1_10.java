/*ID: 21CE131
Name: Rishi Shah
Git Repository Link: https://github.com/21ce114/JAVA-Practicals.git
AIM : Implement Caesar Cipher.*/

public class Part1_10 {
	
	public static String Encrypt(String text, int shift)
	{
		String encryptedText="";
		int length = text.length();
		
		if(shift > 26)
			shift = shift % 26;
		
		else if(shift < 0)
			shift = (shift % 26) + 26;
		
		for (int i = 0; i < length; i++)
		{	
			char ch = text.charAt(i);
			if (Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch)) 
				{
					char c = (char)(ch + shift);
					if(c > 'Z')
						encryptedText = encryptedText+(char)(ch - (26 - shift));
					
					else
						encryptedText = encryptedText+c;
				}
				
				else if (Character.isLowerCase(ch))
				{	/
					char c = (char)(ch + shift);
					if(c > 'z')
						encryptedText += (char)(ch - (26 - shift));
					
					else
						encryptedText = encryptedText+ c;
				}
				
			}
			
			else 
				encryptedText = encryptedText+ch;
			
		}
		
		return encryptedText;
	}
	
	public static String decrypt(String text, int shift)
	{
		String decryptedText="";
		int length = text.length();
		
		if(shift > 26)
			shift = shift % 26;
		
		else if(shift < 0)
			shift = (shift % 26) + 26;
		
		for (int i = 0; i < length; i++)
		{
			char ch = text.charAt(i);
			if (Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch)) 
				{
					char c = (char)(ch - shift);
					if(c < 'A')
						decryptedText = decryptedText+(char)(ch + (26 - shift));
					
					else
						decryptedText = decryptedText+c;
				}
				
				else if (Character.isLowerCase(ch))
				{
					char c = (char)(ch - shift);
					if(c < 'a')
						decryptedText = decryptedText+(char)(ch + (26 - shift));
					
					else
						decryptedText = decryptedText+ c;
				}
				
			}
			
			else 
				decryptedText = decryptedText+ch;
			
		}
		
		return decryptedText;
	}
	public static void main(String[] args) {
		//taking the main massage that is to be encrypted.		
		String text = "This is a message.";
		System.out.println("The encrypted Text is :"+Encrypt(text,3));
		//taking the encrypted message to decrypte it.		
		String text1 = Encrypt(text,3);
		System.out.println("The decreapted Message is :"+decrypt(text1, 3));
	}

}
