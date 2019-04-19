package instructions;

import registers.Memory;
import registers.Registers;

public class FADD extends Instructions{
/**
 * 33	
FADD fr, x, address[,I]	Floating Add Memory To Register
c(fr) -> c(fr) + c(EA)
c(fr) -> c(fr) + c(c(EA)), if I bit set
fr must be 0 or 1.
OVERFLOW may be set

 */
	
	String i,ix,address, fr;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		fr = instruction.substring(6,8);
		ix = instruction.substring(8,10);
		i = instruction.substring(10,11);
		address = instruction.substring(11);
		
		String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register,memory);
		
		register.setMAR(effectiveAddress);
		
		register.setMBR(memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMAR())));
		float valueFR = 0;
		float valueCEA =0;
		if(i.equals("0")) {
			valueFR = UnitConverter.getFloatingPointValue(register.getFloatingRegisterj(fr));
			valueCEA = UnitConverter.getFloatingPointValue(register.getMBR());
			//c(fr) -> c(fr) + c(EA)
			float sum = valueFR +valueCEA;
			
			register.setFloatingRegisterj(fr, UnitConverter.setFloatingPointString(sum));
		}
		else {
			valueFR = UnitConverter.getFloatingPointValue(register.getFloatingRegisterj(fr));
			valueCEA = UnitConverter.getFloatingPointValue(register.getMBR());
			//c(fr) -> c(fr) + c(c(EA)), if I bit set
			valueCEA =UnitConverter.getFloatingPointValue(memory.getFromMemory((int)valueCEA));
			float sum = valueFR +valueCEA;
			
			register.setFloatingRegisterj(fr, UnitConverter.setFloatingPointString(sum));
		}
		register.incrementPC();
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		String message = "";
		return message;
	}

}
