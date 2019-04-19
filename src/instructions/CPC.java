package instructions;

import registers.Memory;
import registers.Registers;

public class CPC extends Instructions {

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		int address = UnitConverter.binaryStringToInteger(instruction.substring(6));
		System.out.println("CPC address: " + address + " instruction: " + (memory.getFromMemory(address)));
		register.setPC(memory.getFromMemory(address));
		
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
