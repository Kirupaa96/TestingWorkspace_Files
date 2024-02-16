package org.phone;

public class InternalStorage {

	public static void main(String[] args) {
		
		ExternalStorage ext = new ExternalStorage();
		ext.size();
		
		
		InternalStorage ist = new InternalStorage();
		ist.processorName();
		ist.ramSize();

	}
	
	
	public void processorName() {
		System.out.println("This method denotes name of the processor");
	}
	
	public void ramSize() {
		System.out.println("This method denotes RAM size");
	}

}
