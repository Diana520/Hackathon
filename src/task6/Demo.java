package task6;

public class Demo {
	public static void main(String[] args) {
		Animal lion = new Lion("Lion", 12, 'm', true, 35);
		lion.animalSay();
		Animal dog = new Dog("Dog", 3, 'f', 60);
		dog.animalSay();
	}
}
