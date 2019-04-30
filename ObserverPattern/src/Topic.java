import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
	
	private List<Observer> observers = new ArrayList<>();
	private String message;
	
	@Override
	public void register(Observer observer) {
		this.observers.add(observer);
		observer.setSubject(this);
	}

	@Override
	public void unregister(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : this.observers) {
			obs.update();
		}
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}
	
	public void postMessage(String message) {
		System.out.println("Topic changed to " + message);
		this.message = message;
		notifyObservers();
	}

}
