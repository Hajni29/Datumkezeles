package hazifeladat;

import java.util.Random;

public class Gy06_10 {

	public static void main(String[] args) {
		// Családtagunk meglepett egy kiskutyával, a nevét azonban nem tudjuk eldönteni 
		// a következő lehetőségek közül: Borzas, Morzsi, Kefir. 
		// Véletlengenerátor segítségével határozzuk meg az új kis-kedvencünk nevét!
		
		
		Random random = new Random();
		String[] nevek = {"Borzas", "Morzsi", "Kefír"};
		System.out.println("A kutya neve legyen: " + nevek[random.nextInt(3)]);
		
		

	}

}
