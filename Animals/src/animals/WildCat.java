//Клас Котячі наслідують класи Домашній і Дикий з відповідними методами. 

package animals;

public abstract class WildCat extends Cats{

	public WildCat(int age, String name, int height, String clutches, int jumpLength) {
		super(age, name, height, clutches, jumpLength);
		// TODO Auto-generated constructor stub
	}

	public abstract void survive();
}
