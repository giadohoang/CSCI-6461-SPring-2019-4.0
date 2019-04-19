package instructions;

import registers.Memory;
import registers.Registers;

public class CHK extends Instructions{

/*
 * 
 * @see instructions.Instructions#execute(java.lang.String, registers.Registers, registers.Memory)
 * 
 * Check Device Status to Register, r = 0..3
c(r) <- device status

 */
	
	String deviceID;
	String r;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		r= instruction.substring(6,8);
		deviceID = instruction.substring(11);
		int idValue = UnitConverter.binaryStringToInteger(deviceID);
		deviceID = Integer.toString(idValue);
		switch (deviceID) {
		case "0":
			register.setGPRj(r, register.getFromDevice(deviceID));
			System.out.println("Check Console Keyboard's status to register: " + r);
			break;
		case "1":
			register.setGPRj(r, register.getFromDevice(deviceID));
			System.out.println("Check Console Printer's status to register: " + r);
			break;
		case "2":
			register.setGPRj(r, register.getFromDevice(deviceID));
			System.out.println("Check Console Card Reader's status to register: " + r);
			break;
		default:
				register.setGPRj(r, register.getFromDevice(deviceID));
				System.out.println("Check Other Consoles' status to register: " + r);
				break;
		}
		
		
		
	}
	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		String message = "CHK instruction: r= " + r + ", deviceID = " + deviceID;
		return message;
	}

}
