package registers;

import java.util.ArrayList;
import java.util.HashMap;

import instructions.UnitConverter;
import registers.Cache.CacheLine;

public class Memory {
	//Create a memory of size 2048 ( 0 -> 2047)
//	static ArrayList<String> memory = new ArrayList<String>();
	 HashMap<Integer, String> memory;
	 
	Cache cache;
	//ArrayList<String> memory2 = new ArrayList<String>();
	
	public Memory() {
		this.memory = new HashMap<>();
		
		for(int i =0; i < 2048; i++) {
			
			this.memory.put(i,"0000000000000000");
		}	
	
		this.cache = new Cache();
		
		memory.put(300,"1111010000000000");//location 300, read from IN to R0
		memory.put(301,"0000100000001010");//location 301, store R0 into Memory[10]
		memory.put(302,"1111010000000000");
		memory.put(303,"0000100000001011");
		memory.put(304,"1111010000000000");
		memory.put(305,"0000100000001100");
		memory.put(306,"1111010000000000");
		memory.put(307,"0000100000001101");
		memory.put(308,"1111010000000000");
		memory.put(309,"0000100000001110");
		memory.put(310,"1111010000000000");
		memory.put(311,"0000100000001111");
		memory.put(312,"1111010000000000");
		memory.put(313,"0000100000010000");
		memory.put(314,"1111010000000000");
		memory.put(315,"0000100000010001");
		memory.put(316,"1111010000000000");
		memory.put(317,"0000100000010010");
		memory.put(318,"1111010000000000");
		memory.put(319,"0000100000010011");
		memory.put(320,"1111010000000000");
		memory.put(321,"0000100000010100");
		memory.put(322,"1111010000000000");
		memory.put(323,"0000100000010101");
		memory.put(324,"1111010000000000");
		memory.put(325,"0000100000010110");
		memory.put(326,"1111010000000000");
		memory.put(327,"0000100000010111");
		memory.put(328,"1111010000000000");
		memory.put(329,"0000100000011000");
		memory.put(330,"1111010000000000");
		memory.put(331,"0000100000011001");
		memory.put(332,"1111010000000000");
		memory.put(333,"0000100000011010");
		memory.put(334,"1111010000000000");
		memory.put(335,"0000100000011011");
		memory.put(336,"1111010000000000");
		memory.put(337,"0000100000011100");
		memory.put(338,"1111010000000000");
		memory.put(339,"0000100000011101");

	}
	
	
	//Initilaize memory to 0
	/*
	public Memory() {
	if(memory == null) {
		memory = new HashMap<>();
	}
		BufferedReader reader;
		try {
			System.out.println("Start creating memory...");
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\Gia\\eclipse-workspace\\CSCI 6461 SPring 2019 2.0/memory.txt"));
			String line = reader.readLine();
			Integer i = 0;
			while (line != null) {
				//System.out.println(line);
				// read next line
				//Memory.setMemory(i, line.trim());	
				System.out.println(line);
				memory.put(i, line.trim());
				line = reader.readLine();
				i++;
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//printMemory(memory);
	}
	
	/**
	 * 
	 * @param address: location on the memory
	 * @return: content on memory
	 */
	
	
	public String getFromMemory(int address) {
		
		return this.memory.get((Integer)address);
	}
	
	public  void setMemory(int address, String content) {
		
		this.memory.put((Integer)address, content);
	}
	
	public void printMemory(ArrayList<String> memory2) {
		memory2.toString();
	}
	
	/*
	 *getFromCache
	 *if cache does not contains the address required
	 *it will go to memory, get data inside that location
	 *put into cache using FIFO
	 *and return into request
	 */
	public String getFromCache(int address) {
		String value="";
		//find in each line of cache a tag that = address
		for(CacheLine lineInCache : this.cache.getCacheLine()) {
			//if tag is found, return to request
			if(address == lineInCache.getTag()) {
				return lineInCache.getData();
			}
		}
		//if cannot find in cache
		//go to memory location: address, copy the content
		String content = getFromMemory(address);
		
		//put this content into cache, address tag
		cache.setToCache(address, content);
		//return to request
		return value;
		
	}
	
	public void setCache(int address, String content) {
		//store into main memory
		setMemory(address, content);
		
		for(CacheLine lineInCache : this.cache.getCacheLine()) {
			if(address == lineInCache.getTag()) {
				//if found the tag, store new content into it
				lineInCache.setData(content);
				return;
			}
		}
		//if there is no tag found
		this.cache.setToCache(address, content);
	}


	public void loadProgram2(int wordToFindLength, int wordToFindEndLocation, int paragraphLength, int paragraphEndLocation) {
		// TODO Auto-generated method stub
		memory.put(6, UnitConverter.integerTo16BitBinary(1000));
		memory.put(7, UnitConverter.integerTo16BitBinary(500));
		memory.put(8, UnitConverter.integerTo16BitBinary(1000));
		memory.put(9, UnitConverter.integerTo16BitBinary(500));
		
		memory.put(10, UnitConverter.integerTo16BitBinary(1));
		memory.put(11, UnitConverter.integerTo16BitBinary(1));
		memory.put(12, UnitConverter.integerTo16BitBinary(46));
		memory.put(13, UnitConverter.integerTo16BitBinary(32));
		
		memory.put(14, UnitConverter.integerTo16BitBinary(60));
		memory.put(15, UnitConverter.integerTo16BitBinary(70));
		memory.put(16, UnitConverter.integerTo16BitBinary(80));
		memory.put(17, UnitConverter.integerTo16BitBinary(90));
		memory.put(18, "00000000000000000");
		memory.put(19, UnitConverter.integerTo16BitBinary(0));
		memory.put(20, UnitConverter.integerTo16BitBinary(50));
		memory.put(21, UnitConverter.integerTo16BitBinary(68));
		memory.put(22, UnitConverter.integerTo16BitBinary(1));
		memory.put(23, UnitConverter.integerTo16BitBinary(wordToFindLength));
		memory.put(24, UnitConverter.integerTo16BitBinary(paragraphLength));
		memory.put(25, UnitConverter.integerTo16BitBinary(0));
		memory.put(26, UnitConverter.integerTo16BitBinary(paragraphEndLocation));
		memory.put(27, UnitConverter.integerTo16BitBinary(40));//to table 40
		memory.put(28, UnitConverter.integerTo16BitBinary(45));//to table 45
		memory.put(29, UnitConverter.integerTo16BitBinary(wordToFindEndLocation - wordToFindLength +1 ));
		memory.put(30, UnitConverter.integerTo16BitBinary(wordToFindEndLocation));
		memory.put(31, UnitConverter.integerTo16BitBinary(0));
		
		memory.put(40,"0000010100010110");
		memory.put(41,"0000100100010010");

		memory.put(45,"0000010100010110");
		memory.put(46,"0000100100010011");

		
		//When current char is a period, ASCII = 46
		memory.put(60,"0000011000010110");
		memory.put(61,"0000101000001010");
		memory.put(62,"0001001000001011");
		memory.put(63,"0000101000001011");
		memory.put(64,"0011010000010101");

		//When current char is a sapce, ASCII = 32
		memory.put(70,"0000011000010110");
		memory.put(71,"0001001000001010");
		memory.put(72,"0000101000001010");
		memory.put(73,"0011010000010101");

		//When 2 char match
		memory.put(80,"0000011000010110");
		memory.put(81,"0001001000001000");
		memory.put(82,"0000101000001000");
		memory.put(83,"0000011000010110");
		memory.put(84,"0001001000001001");
		memory.put(85,"0000101000001001");
		memory.put(86,"0011010000010100");

		//Just increment
		memory.put(90,"0000011000010110");
		memory.put(91,"0001001000001000");
		memory.put(92,"0000101000001000");
		memory.put(93,"0000011000000111");
		memory.put(94,"0000101000001001");
		memory.put(95,"0011010000010100");

		//Loop through this to find word we need
		memory.put(50,"0000010100001001");
		memory.put(51,"0001010100010111");
		memory.put(52,"0010100100011011");
		memory.put(53,"0000011100001000");
		memory.put(54,"0001011100011000");
		memory.put(55,"0010101100011100");
		memory.put(56,"1010010001001000");
		memory.put(57,"0000010001100000");
		memory.put(58,"0001010000001100");
		memory.put(59,"0010100000001110");
		memory.put(60,"0000010001100000");
		memory.put(61,"0001010000001101");
		memory.put(62,"0010100000001111");
		memory.put(63,"0000010001100000");
		memory.put(64,"0000100000011001");
		memory.put(65,"0000010100001001");
		memory.put(66,"0001010100011001");
		memory.put(67,"0010100100010000");
		memory.put(68,"0011010000010001");
		
		
	}
	
	
}
