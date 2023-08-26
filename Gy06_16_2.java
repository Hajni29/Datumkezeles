package hazifeladat;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Gy06_16_2 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			nagykoruEldontKiir();

		}

		public static void nagykoruEldontKiir() {

			boolean isValid = false;
			LocalDate szuletesiDatum = null;
			try {
				while (!isValid) {
					System.out.println("Adja meg a születési dátumát (yyyy-mm-dd): ");


					szuletesiDatum = LocalDate.parse(scanner.nextLine());

					if (szuletesiDatum.isAfter(LocalDate.now())) {
						System.out.println(
								"A születési dátum nem lehet későbbi, mint a jelenlegi dátum.");
					} else
						isValid = true;
				}
			} catch (Exception e) {
				System.out.println("Érvénytelen a megadott dátum. A helyes formátum: (yyyy-mm-dd)");
				e.printStackTrace();
			}
			int age = (Period.between(szuletesiDatum, LocalDate.now())).getYears();
			System.out.println((age > 17) ? "A felhasználó nagykorú." : "A felhasználó kiskorú.");
	}

}
