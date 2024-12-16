package JavaStudy6;

public class Main {
	
	private static Sample[] samples = {
			new Sample("A"),
			new Sample("B"),
			new Sample("C"),
			null
	};

	public static void main(String[] args) {

		System.out.println(samples[1]);
		System.out.println(samples[3]);
	}

}
