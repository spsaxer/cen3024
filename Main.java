package week02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner scan = new Scanner(System.in);
		String input;
		ArrayList<String> m_dictionary;
		ArrayList<String> m_toCheck;
		
		
		
		System.out.println("Please enter the path of the txt file to check: ");
		input = scan.nextLine();
		
		m_toCheck = createArray(input);
		
		System.out.println("Please enter the path of the dictionary txt file: ");
		input = scan.nextLine();
		
		m_dictionary = createArray(input);
		
		
		scan.close();
		
		for(int i = 0; i < m_toCheck.size(); i++)
		{
			String testWord = m_toCheck.get(i);
			if(m_dictionary.contains(testWord))
			{
				
			}
			else
			{
				System.out.println(testWord + " does not exist in the dictionary.");
			}
		}

	}
public static ArrayList<String> createArray(String userInput) throws IOException
	
	{
		String m_userInput = userInput;
		BufferedReader br = null;
		ArrayList<String> m_list = new ArrayList<String>();
		
		try {
			br = new BufferedReader(new FileReader(m_userInput));
					String nm;
			while((nm = br.readLine()) != null)
			{
				m_list.add(nm);
			}
		}
		finally
		{
			if(br != null)
				br.close();
		}
			return m_list;		
	}


}
