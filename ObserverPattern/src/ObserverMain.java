
public class ObserverMain {

	public static void main(String[] args) {
		Topic topic = new Topic();
		
		TopicSubsriber obs1 = new TopicSubsriber("Obs 1");
		TopicSubsriber obs2 = new TopicSubsriber("Obs 2");
		TopicSubsriber obs3 = new TopicSubsriber("Obs 3");
		
		topic.register(obs1);
		topic.register(obs2);
		topic.register(obs3);
		
		topic.postMessage("It's a new fucking day nikka !");
	}

}
