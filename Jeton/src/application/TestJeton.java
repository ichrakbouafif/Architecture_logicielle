package application;

import metier.Jeton;

public class TestJeton {
	public static void main(String[] args) {
		for(int i=0; i<8;i++) {
			Jeton semaphore = new Jeton();
			System.out.println(semaphore.toString());
		}
	}

}
