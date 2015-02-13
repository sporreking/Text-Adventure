package sk.client.scene;

public class Phrase {
	
	public static final int DEFAULT_DELAY = 1000;
	
	public final String PHRASE;
	public final int DELAY;
	
	public Phrase(String phrase) {
		PHRASE = phrase;
		DELAY = DEFAULT_DELAY;
	}
	
	public Phrase(String phrase, int delay) {
		PHRASE = phrase;
		DELAY = delay;
	}
	
	public void print() throws Exception {
		Thread.sleep(DELAY);
		System.out.println(PHRASE);
	}
}