//+Клас Котячі наслідує клас Тварина, також має властиві цьому класу поля і методи. 

package animals;

public abstract class Cats extends Animal {

	private String clutches;
	private int jumpLength;

	public Cats(int age, String name, int height, String clutches, int jumpLength) {
		super(age, name, height);
		this.clutches = clutches;
		this.jumpLength = jumpLength;
	}

	public abstract void jump();

	public void clutch() {
		System.out.println("Cats can clutch");
	}

}
