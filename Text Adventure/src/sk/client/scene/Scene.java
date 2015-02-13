package sk.client.scene;

public class Scene {
	
	public final String NAME;
	
	private String[] phrases;
	
	public Scene(String name, String[] phrases, String[] alternatives, String[] results) {
		NAME = name;
		this.phrases = phrases;
	}
}