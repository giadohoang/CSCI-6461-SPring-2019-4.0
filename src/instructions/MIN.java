package instructions;

import registers.Memory;
import registers.Registers;
/*
 * Custom instruction: MIN opcode: 011011
 * sort value of register X and Y in ascending order
 * If c(GPRx) < c(GPRy), Store c(GPRx) to Content at EA and pc +1,
else PC + 2  
 */
public class MIN extends Instructions{
String registerX, registerY, effectiveAddress;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		registerX = instruction.substring(6, 8);
		registerY = instruction.substring(8,10);
		effectiveAddress = instruction.substring(10);
		int valueX = UnitConverter.binaryStringToInteger(register.getGPRj(registerX));
		int valueY = UnitConverter.binaryStringToInteger(register.getGPRj(registerY));
		
		if(valueX < valueY ) {
			memory.setCache(UnitConverter.binaryStringToInteger(effectiveAddress), register.getGPRj(registerX));
			register.incrementPC();
		}
		else {
			register.incrementPC();
			register.incrementPC();
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
