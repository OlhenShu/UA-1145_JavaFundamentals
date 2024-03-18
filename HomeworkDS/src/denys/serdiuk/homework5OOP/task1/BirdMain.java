package denys.serdiuk.homework5OOP.task1;

public class BirdMain {

	public static void main(String[] args) {
		Bird eagle = new FlyingBird("Eagle", true, true);
		Bird swallow = new FlyingBird("Swallow", true, true);
		Bird penguin = new NonflyingBird("Penguin", false, true);
		Bird kiwi = new NonflyingBird("Kiwi", true, true);
		
		Bird [] birds = {eagle, swallow, penguin, kiwi};
		
		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i].toString() + birds[i].fly());
		}
		
	}
}
