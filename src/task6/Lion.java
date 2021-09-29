package task6;

public class Lion extends Animal {
	private boolean dangerous; // lion is angry or kind
	private double hair;// size of hair

	public Lion(String name, int age, char gender, boolean dangerous, double hair) {
		super(name, age, gender);
		this.dangerous = dangerous;
		this.hair = hair;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	public double getHair() {
		return hair;
	}

	public void setHair(double hair) {
		this.hair = hair;
	}

	@Override
	public String toString() {
		return "Lion [dangerous=" + dangerous + ", hair=" + hair + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void animalSay() {
		System.out.println("Rooar");
	}

}
