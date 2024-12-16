package javaStydy5;

public class Main {

	public static void main(String[] args) {
		
		
	}
	
	
	abstract sealed class B  {
		private void sample() {
			System.out.println("B");
		}
	}
	
	final class C extends B {
		public void sample() {
			System.out.println("C");
		}
	}

}
