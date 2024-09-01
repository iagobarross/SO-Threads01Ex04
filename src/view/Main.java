package view;

import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			Thread t = new ThreadSapo(0, 100, 0);
			t.start();
		}
	}

}
