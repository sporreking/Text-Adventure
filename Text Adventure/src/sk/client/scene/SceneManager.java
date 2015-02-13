package sk.client.scene;

import java.util.HashMap;

public class SceneManager {
	
	private HashMap<String, Scene> scenes;
	
	private Scene currentScene;
	
	public SceneManager() {
		scenes = new HashMap<>();
	}
	
	public void registerScenes() {
		registerScene(new Scene("Main"));
	}
	
	public void update() {
		
	}
	
	public Scene enterScene(String name) {
		currentScene = scenes.get(name);
		return currentScene;
	}
	
	public Scene getScene(String name) {
		return scenes.get(name);
	}
	
	public SceneManager registerScene(Scene scene) {
		scenes.put(scene.NAME, scene);
		return this;
	}
}