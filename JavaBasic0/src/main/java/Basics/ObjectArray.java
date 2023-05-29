package Basics;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[] = new Object [5];
		
		a[0] = 10;
		a[1] = 23.5;
		a[2] = "Text";
		a[3] = true;
		a[4] = 'A';
		
		//Reading Data
		
		for(int i=0; i<5;i++) {
			System.out.println(a[i]);
		}

	}

}
