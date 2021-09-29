package task6;

public class Butterfly extends Animal{
	private String color;

	public Butterfly(String name, int age, char gender, String color) {
		super(name, age, gender);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Butterfly [color=" + color + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public void animalSay() {
		System.out.println("just fly");
	}

}
