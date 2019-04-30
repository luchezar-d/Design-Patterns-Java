
public class Light {
	private boolean on;
	
	public void switchOn() {
		System.out.println("Lights on");
		this.on = true;
	}
	
	public void switchOff() {
		System.out.println("Lights off");
		this.on = false;
	}
}
