package io.gaikwadabhishek.springbootstarter.topic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private java.util.List<Topic> topics = new ArrayList<>( Arrays.asList( 
			new Topic("spring", "Spring Framework","Spring Framework Description"),
			new Topic("java", "java Framework","Spring Framework Description"),
			new Topic("Abhishek", "javascipt Framework","Spring Framework Description")
			
			));
	public java.util.List<Topic> getAllTopics() {
		return topics;
	}
	public Topic getTopic(String ID) {
		return topics.stream().filter(t -> t.getID().equals(ID)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}
	public void udpateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getID().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getID().equals(id));
	}
	
}
