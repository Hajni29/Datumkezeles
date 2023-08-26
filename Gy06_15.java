package hazifeladat;

import java.time.LocalDate;

public class Gy06_15 {

	public static void main(String[] args) {
		// Írjuk ki a 10 nappal ezelőtti dátumot!
		
		System.out.println(LocalDate.now().minusDays(10));

	}

}
