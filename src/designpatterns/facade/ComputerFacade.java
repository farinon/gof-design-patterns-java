package designpatterns.facade;

public class ComputerFacade {

	public HardDrive harddrive;
	public Memory memory;
	public Processor processor;
	
	public ComputerFacade() {
		
		this.harddrive = new HardDrive();
		this.memory = new Memory();
		this.processor = new Processor();
		
		}
	
	public void run() {
		harddrive.readData();
		memory.loadData();
		processor.processData();
		
		
	}


	
}
