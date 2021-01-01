
public abstract class GameObject {

	public abstract void draw();

	public static void main(String[] args) {
		GameObject player = new Player();
		GameObject menu = new Menu();

		GameObject[] gameObjects = new GameObject[2];
		gameObjects[0] = player;
		gameObjects[1] = menu;

		for (GameObject obj : gameObjects) {
			obj.draw();
		}

	}

}
