
public class CommandMain {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remoteControl.setCommand(lightOn);
		remoteControl.pressButton();
		
		remoteControl.setCommand(lightOff);
		remoteControl.pressButton();
		
	}

}
