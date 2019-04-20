package instructions;

import registers.Memory;
import registers.Registers;

public class VSUB extends Instructions{
	String fr,ix,i,vector1, vector2,address;
	int vector1Address,vector2Address;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		fr = instruction.substring(6,8);
		ix = instruction.substring(8,10);
		address = instruction.substring(11);
		i = instruction.substring(8, 9);
		String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register,memory);
		int vectorLength = Integer.parseInt(register.getFloatingRegisterj(fr));
		if(!i.equals("1")) {
			vector1Address = UnitConverter.binaryStringToInteger(memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress)));
			
			//vector2Address = UnitConverter.binaryStringToInteger(memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress) +1));
			vector2Address = vector1Address+1;
		
		} else {
			vector1Address = UnitConverter.binaryStringToInteger(memory.getFromMemory(UnitConverter.binaryStringToInteger(memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress)))));
			vector2Address = UnitConverter.binaryStringToInteger(memory.getFromMemory(UnitConverter.binaryStringToInteger(memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress) +1))));
		}
		
		for(int i = 0 ; i < vectorLength;i++) {
			int vectorSum = UnitConverter.binaryStringToInteger(memory.getFromMemory(vector1Address)) -
					UnitConverter.binaryStringToInteger(memory.getFromMemory(vector2Address));
			if(vectorSum > Math.pow(2, 6)) {
				String currentConditionalCode = register.getCC();
				char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
				//set cc(0) =1
				//if over flow
				if(register.isOverFlow(vectorSum)) {
				currentConditionalCodeChars[0] = '1';
				currentConditionalCode = String.valueOf(currentConditionalCodeChars);
				//Set overflow flag on condition code
				register.setCC(currentConditionalCode);
				//register.setCc();
				}
				
				//set cc(1) =1
				//if under flow
				else {
					currentConditionalCodeChars[1] = '1';
					currentConditionalCode = String.valueOf(currentConditionalCodeChars);
					//Set overflow flag on condition code
					register.setCC(currentConditionalCode);
					//register.setCc();
				}
			}
			
			register.setMBR(UnitConverter.integerTo16BitBinary(vectorSum));
			register.setMAR(UnitConverter.integerTo16BitBinary(vector1Address));
			memory.setMemory(vector1Address, UnitConverter.integerTo16BitBinary(vectorSum));
			vector1Address++;
			vector2Address++;
		}
		
		register.incrementPC();
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
System.out.println("VSUB instruction, FR: " + fr + ", IX: " + ix + ", address: " + address + ", I: " + i   );
		

		//String message = "LDR instruction, R: \" + r + \", IX: \" + ix + \", address: \" + address + \", I: \" + i ";
		return "VSUB instruction, FR: " + fr + ", IX: " + ix + ", address: " + address + ", I: " + i;


	}

}
