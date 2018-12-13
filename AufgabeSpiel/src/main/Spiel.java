package main;
import java.util.Random;

import aufbau.*;
public class Spiel {

	public static void main(String[] args) {
		
		
		Game game1 = new Game();
		Held harald = new Held("Harald", 10);
		
		Gegenstand apfel = new Gegenstand();
		
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(4));
		}
		
		
	}

}
