package task6;

public class Anaconda extends Animal {
	private double length;

	public Anaconda(String name, int age, char gender, double length) {
		super(name, age, gender);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Anaconda [length=" + length + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public void animalSay() {
		System.out.println("Shhhhh");
	}
}
