
public class TopicSubsriber implements Observer {

	private String name;
	private Subject topic;
	
	public TopicSubsriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		System.out.println(this.name + "has been updated with " + msg);
	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;
	}

}
