package instructions;

import registers.Memory;
import registers.Registers;
/*
 * Custom Instruction: ABS opcode: 011010
 * Convert int value from register GPR(x) into ist absolute value
 * And store back to register GPR(y)
 */
public class ABS extends Instructions {
String registerX, registerY;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		registerX = instruction.substring(6, 8);
		registerY = instruction.substring(8,10);
		
		int value = UnitConverter.binaryStringToInteger(register.getGPRj(registerX));
		value = Math.abs(value);
		register.setGPRj(registerY, UnitConverter.integerTo16BitBinary(value));
		
		register.incrementPC();
		
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		
		return "ABS instruction from GPR(" + registerX + "), store into GPR(" + registerY + ") +\n";
	}

}
