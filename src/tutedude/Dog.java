package tutedude;

public class Dog extends Animal implements Playable {
	void sound() {
		System.out.println("Dog makes a sound: Woof");
	}
	public void play() {
		System.out.println("Dog can play: Yes");
	}

}
