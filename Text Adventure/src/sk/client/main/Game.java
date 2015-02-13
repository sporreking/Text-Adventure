package sk.client.main;

import sk.client.scene.SceneManager;

public class Game {
	
	public static final boolean VSYNC_ENABLED = false;
	
	public static boolean running = true;
	
	private SceneManager sm;
	
	public Game() {
		sm = new SceneManager();
		
		sm.registerScenes();
		
		while(running)
			loop();
	}
	
	public void loop() {
		sm.update();
	}
}