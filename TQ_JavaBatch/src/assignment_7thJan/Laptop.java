package assignment_7thJan;

public class Laptop {

private	int noOfUSBPort;
private	int processorSpeed;

	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}

	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public static void main(String[] args) {
		Laptop lp = new Laptop();
		lp.setNoOfUSBPort(4);
		lp.setProcessorSpeed(4);
		System.out.println("No. of USB ports = " + lp.getNoOfUSBPort());
		System.out.println("Processor speed = " + lp.processorSpeed + "GHz");
	}

}
