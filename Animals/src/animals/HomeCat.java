//Клас Котячі наслідують класи Домашній і Дикий з відповідними методами. 

//Клас Кіт повинен наслідувати клас Домашній, 
//а Клас Ягуар буде наслідуватись від класу Дикий. 
//В класі Мейнстворити екземпляри останніх двох класів (тобто об*єкти) і 
//вивести всі доступні методи +назви всіх класів від яких походить даний об*єкт.
package animals;

public abstract class HomeCat extends Cats{

	public HomeCat(int age, String name, int height, String clutches, int jumpLength) {
		super(age, name, height, clutches, jumpLength);
		// TODO Auto-generated constructor stub
	}

	public abstract void play();
}
