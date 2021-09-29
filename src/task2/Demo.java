package task2;

public class Demo {
	public static void main(String[] args) {
		System.out.println(random());
	}

	public static long random() {
		long start = 0L;
		long finish = 100L;
		long currentTime = System.currentTimeMillis();
		long randomNumber = start + currentTime % (finish - start);
		return randomNumber;
	}
}
