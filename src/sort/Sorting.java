package sort;
//sort words of given strings, then sort characters in each word
import java.util.Scanner;//Importing Scanner Class

public class Sorting 
{
	public static void main(String args[]) 
	{

		Scanner sc = new Scanner(System.in);//Creating object of Scanner Class
		System.out.print("Enter String: ");
		String input = sc.nextLine();// Accepting user input for strings
		sc.close();//Closing Scanner object
		// String input ="My name is XYZ";
		input = input + " ";// Add a space at end of input String
		// Find number of words
		int numberOfWords = 0;
		for (int i = 0; i < input.length(); i++) 
		{
			char ch = input.charAt(i);
			if (ch == ' ') 
			{
				numberOfWords++;
			}
		}
		// Extract words and store in array
		String[] words = new String[numberOfWords];
		int startIndex = 0;
		int currentWord = 0;
		for (int i = 0; i < input.length(); i++) 
		{
			char ch = input.charAt(i);
			if (ch == ' ') 
			{
				String word = input.substring(startIndex, i);
				words[currentWord] = word;
				currentWord++;
				startIndex = i + 1;
			}
		}
		// Sort words of the given strings
		for (int i = 0; i < words.length - 1; i++) 
		{
			for (int j = i+1; j < words.length ; j++) 
			{
				if (words[j].compareTo(words[i])<0) 
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		// Print words
		System.out.println("Sorted string is");
		for (int i = 0; i < words.length; i++) 
		{
			System.out.print(words[i] + " ");
		}
		//Used to print space between lines
		System.out.println(" ");
		System.out.println(" ");
		//Sorting  and printing Characters of each sorted words of the given strings
		System.out.println("Sorted characters of each sorted word in the given string");
		for(int k=0;k<words.length;k++)
		{            
			char[] charArray = words[k].toCharArray();
			for(int i=0;i<(charArray.length);i++)
			{
				for(int j=i+1;j<(charArray.length);j++)
				{
					if(charArray[j]<charArray[i])
					{
						char temp=charArray[i];
						charArray[i]=charArray[j];
						charArray[j]=temp;
					}
				}

			}

			String result="";
			for(int m=0;m<charArray.length;m++)
			{
				result+=charArray[m];
			} 
			
			System.out.print(result);

			System.out.print(" ");  
		}		
	}
}