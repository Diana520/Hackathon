package task6;

public class Dog extends Animal{
	private double height;
	
	public Dog(String name, int age, char gender, double height) {
		super(name, age, gender);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Dog [height=" + height + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public double isHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	} 
	
	@Override
	public void animalSay() {
		System.out.println("Gaffff");
	}
	

}
