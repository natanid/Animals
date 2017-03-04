//+В класі Мейн створити екземпляри останніх двох класів (тобто об*єкти) і 
//+вивести всі доступні методи +назви всіх класів від яких походить даний об*єкт.
package animals;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "Murzik", 30, "MurzikClutches", 2);
		Jaguar jaguar = new Jaguar(5, "Jagu", 60, "JaguClutches", 3);
		// System.out.println(cat.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass());

		Animal[] animals = new Animal[]{cat,jaguar};
		
		for (Animal animal : animals) {
			
		Class<? extends Animal> superClassMethods = animal.getClass();
		System.out.println(animal.getClass().getSuperclass());
		Method[] methods = superClassMethods.getMethods();
		for (Method method : methods) {
			System.out.println("Method's name: " + method.getName());
		}
		Class<?> superClassClass = animal.getClass();
		while (superClassClass != null) {
			System.out.println(superClassClass.getName());
			superClassClass = superClassClass.getSuperclass();
		}
		// System.out.println("Method's type: "
		// +method.getReturnType().getName());
		// Class[] paramTypes = method.getParameterTypes();
		// System.out.print("Types of parameters: ");
		// for (Class paramType : paramTypes) {
		// System.out.print(" " + paramType.getName());
		// }
		System.out.println();
		}
	}
}
