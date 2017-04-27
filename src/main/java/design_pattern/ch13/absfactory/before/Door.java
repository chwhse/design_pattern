package design_pattern.ch13.absfactory.before;

public abstract class Door {
	private DoorStatus doorStatus;

	public Door() {
		doorStatus = doorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}
	
	
	public void close(){
	if(this.doorStatus == doorStatus.CLOSED){
		return;
	}
		doClose();
		this.doorStatus = DoorStatus.CLOSED;
		
	};
	protected abstract void doClose();
	
	public void open(){
		if(this.doorStatus == doorStatus.OPENED){
			return;
		}
			doOpen();
			this.doorStatus = DoorStatus.OPENED;
		
	};
	protected abstract void doOpen();
	
	
}
