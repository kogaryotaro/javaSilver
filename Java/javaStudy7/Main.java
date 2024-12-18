package javaStudy7;

public class Main {

	public static void main(String[] args) {

		int result = new Test().exam(null);
		System.out.println(result);
	}
}

class Test {
	int exam(String str) {
		int total = 0;
		switch(str) {
			case "A" -> total++;
			case "B" -> total++;
			case "C" -> total++;
			default -> total++;
		}
		return total;
	}
}
