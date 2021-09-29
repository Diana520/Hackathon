package task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
	public final static long MAX = 10000;

	public static void main(String[] args) {
		random();
	}

	public static void random() {
		LinkedList<Long> list = new LinkedList<>();
		for (int i = 1; i < MAX; i++) {
			list.add(generateRandom());
		}
		File file = new File("files/file.txt");
		if (!file.exists()) {
			System.out.println("no such file");
			try {
				file.createNewFile();
				System.out.println("new file created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try (final FileWriter writer = new FileWriter(file, false)) {
			for (Long l : list) {
				final String s = Long.toString(l);
				writer.write(s);
				if (l.equals(getLastElement(list))) {
					break;
				}
				writer.append(',');
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static Object getLastElement(final Collection c) {
		final Iterator itr = c.iterator();
		Object lastElement = itr.next();
		while (itr.hasNext()) {
			lastElement = itr.next();
		}
		return lastElement;
	}
	private static long generateRandom() {
		long start = 0L;
		long finish = 100L;
		long currentTime = System.currentTimeMillis();
		long randomNumber = start + currentTime % (finish - start);
		return randomNumber;
	}

}
