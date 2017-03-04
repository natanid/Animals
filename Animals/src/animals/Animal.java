//+На вершині ієрархії повинен бути клас Тварина, в ньому мають бути деякі свої поля і методи.

package animals;

public abstract class Animal {

	private int age;
	private String name;
	private int height;

	public Animal(int age, String name, int height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public abstract void sleep();

	public void eat() {
		System.out.println("Animal eats");
	}

}
