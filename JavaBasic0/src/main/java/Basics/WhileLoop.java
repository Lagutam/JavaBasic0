package Basics;

public class WhileLoop {

	public static void main(String[] args) {
		// While Loop Demo
		
		int i=1; //initialization
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		
		//Print only even number
		i=1;
				while (i<=100) {
					if (i%2==0)
						System.out.println(i);
					i++;
				}
				
		//Print only odd number
		i=1;
		while (i<=100) {
					if (i%2!=0)
						System.out.println(i);
					i++;
				}
	}

}
