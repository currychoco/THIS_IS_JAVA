package car;

abstract public class Car {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void run();
	public abstract void stop();
}
