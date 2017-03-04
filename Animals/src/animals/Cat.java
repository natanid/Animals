//Клас Кіт повинен наслідувати клас Домашній, 

package animals;

public class Cat extends HomeCat {

	public Cat(int age, String name, int height, String clutches, int jumpLength) {
		super(age, name, height, clutches, jumpLength);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jump() {
		System.out.println("Cat jumps");

	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep");

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
