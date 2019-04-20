package instructions;

import registers.Memory;
import registers.Registers;

public class STFR extends Instructions{

	String fr, ix, i, address;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		fr = instruction.substring(6,8);
		ix = instruction.substring(9,11);
		i = instruction.substring(8,9);
		address = instruction.substring(11);
		
		String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register, memory);
		
		String exponent = register.getFloatingRegisterj(fr).substring(0, 8)+"00000000";
		String mantissa = "00000000" + register.getFloatingRegisterj(fr).substring(8);
		
		if(i.equals("0")) {
			memory.setMemory(UnitConverter.binaryStringToInteger(effectiveAddress), exponent);
			memory.setMemory(UnitConverter.binaryStringToInteger(effectiveAddress)+1, mantissa);
			
		}
		//Indirect bit is set
		else {
			String location = memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress));
			memory.setMemory(UnitConverter.binaryStringToInteger(location), exponent);
			memory.setMemory(UnitConverter.binaryStringToInteger(location)+1, mantissa);
			
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
System.out.println("STFR instruction, FR: " + fr + ", IX: " + ix + ", address: " + address + ", I: " + i   );
		

		//String message = "LDR instruction, R: \" + r + \", IX: \" + ix + \", address: \" + address + \", I: \" + i ";
		return "STFR instruction, FR: " + fr + ", IX: " + ix + ", address: " + address + ", I: " + i;


	}

}
