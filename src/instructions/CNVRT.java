package instructions;

import registers.Memory;
import registers.Registers;

public class CNVRT extends Instructions{

	String r, ix, i,address,F;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		r= instruction.substring(6,8);
		ix = instruction.substring(9,11);
		i = instruction.substring(8,9);
		address = instruction.substring(11);
		
		String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register,memory);
		//The r register contains the value of F before the instruction is executed.
		F = register.getGPRj(r);
		int fValue = UnitConverter.binaryStringToInteger(F);
		//If F = 0, convert c(EA) to a fixed point number and store in r.
		if(fValue == 0) {
			register.setGPRj(r, memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress)));
		}
		//If F = 1, convert c(EA) to a floating point number and store in FR0.
		else if (fValue ==1) {
			register.setFloatingRegisterj("00", memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress)));
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		String message = "";
		return message;
	}

}
