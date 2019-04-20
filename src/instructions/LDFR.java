package instructions;

import registers.Memory;
import registers.Registers;

public class LDFR extends Instructions {

	String fr, ix, i, address;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		fr = instruction.substring(6, 8);
		ix = instruction.substring(9, 11);
		i = instruction.substring(8, 9);
		address = instruction.substring(11);

		String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address,
				register, memory);
		String exponent;
		String mantissa;
		if (i.equals("1")) {
			exponent = memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress));
			mantissa = memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress) + 1);
			exponent = exponent.substring(0, 9);
			mantissa = mantissa.substring(9);
			register.setFloatingRegisterj(fr, exponent + mantissa);
		} else {

			exponent = memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress));
			mantissa = memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress) + 1);
			exponent = exponent.substring(0, 8);
			mantissa = mantissa.substring(8);
			String result = memory.getFromMemory(UnitConverter.binaryStringToInteger(exponent + mantissa));
			register.setFloatingRegisterj(fr, result);

		}

		register.incrementPC();
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub

		System.out.println("LDFR instruction, FR: " + fr + ", IX: " + ix + ", address: " + address + ", I: " + i   );
		

		//String message = "LDR instruction, R: \" + r + \", IX: \" + ix + \", address: \" + address + \", I: \" + i ";
		return "LDFR instruction, FR: " + fr + ", IX: " + ix + ", address: " + address + ", I: " + i;

	}

}
