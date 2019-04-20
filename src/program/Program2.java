package program;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import instructions.UnitConverter;
import registers.Memory;
import registers.Registers;

public class Program2 {
	StringBuilder result = new StringBuilder("");
	int wordToFindLocation = 500;
	int paragraphLocation = 1000;
	int paragraphLength = 0;
	int wordToFindLength = 0;
	public String paragraph;
	public String word;
	public String readFromFile2() {
		
		try {
			//FileReader file = new FileReader("program2Paragraph");
			FileReader file = new FileReader("program2Paragraph-DONOTCHANGE");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}
			scanner.close();
		} catch(IOException exception) {
			exception.printStackTrace();
		}
			System.out.println(result.toString());
			paragraph = result.toString();
			
		return result.toString();
	}
	
	public String readFromFile() {
		// String val = "";

	      try {
	    	  InputStream is = getClass().getResourceAsStream("program2Paragraph-DONOTCHANGE");
	    	    InputStreamReader isr = new InputStreamReader(is);
	    	    BufferedReader br = new BufferedReader(isr);
	    	    String line;
	    	    while ((line = br.readLine()) != null) 
	    	    {
	    	    	result.append(line).append("\n");
	    	    }
	    	    br.close();
	    	    isr.close();
	    	    is.close();
	         } 
	        // i.close();
	       catch(Exception e) {
	         System.out.println(e);
	      }
	      System.out.println(result.toString());
			paragraph = result.toString();
			
		return result.toString();
	}
	

	public void storeWordToFind(String wordToFind, Memory memory) {
		// TODO Auto-generated method stub
		System.out.println("First location: " + wordToFindLocation);
		for(char c : wordToFind.toCharArray()) {
			
			memory.setCache(wordToFindLocation, UnitConverter.charToBinary(c));
			System.out.println("Store char: '" + c + "', at: " + wordToFindLocation);
			wordToFindLocation++;
		}
		//adjust index after last loop
		wordToFindLocation--;
		System.out.println("Last location: " + wordToFindLocation);
		
		wordToFindLength = wordToFind.length();
		word = wordToFind;
		memory.loadProgram2(wordToFindLength , wordToFindLocation , paragraphLength, paragraphLocation);
		
		
		
	}
	
	public void storeParagraph(String paragraph, Memory memory) {
		// TODO Auto-generated method stub
		System.out.println("First location: " + paragraphLocation);
		for(char c : paragraph.toCharArray()) {
			memory.setCache(paragraphLocation, UnitConverter.charToBinary(c));
			//System.out.println("Store char: '" + c + "', at: " + paragraphLocation);
			System.out.println("Store char: '" + UnitConverter.binaryStringToChar(memory.getFromMemory(paragraphLocation)) + "', at: " + paragraphLocation);
			paragraphLocation++;
		}
		//adjust index after last loop
		paragraphLocation--;
		paragraphLength=paragraph.length();
		System.out.println("Last location: " + paragraphLocation);
		
	}

	public void findWord(int wordToFindLocation,int paragraphLocation, Memory memory, Registers register ) {
		
	}

	
}
