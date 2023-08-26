package hazifeladat;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Gy06_18 {

	public static void main(String[] args) {
		// Kérjünk be egy dátumot, majd határozzuk meg milyen napon született H-V!
		
		System.out.println("Kérem adjon meg egy születési dátumot: ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adja meg a születési évet (pl.: 1990): ");
		int szulEv = Integer.parseInt(scanner.nextLine());
		System.out.print("Adja meg a születési hónapot (pl.: 03): ");
		int szulHonap = Integer.parseInt(scanner.nextLine());
		System.out.print("Adja meg a születési napot (pl.: 08): ");
		int szulNap = Integer.parseInt(scanner.nextLine());
		
	    LocalDate birthDate = LocalDate.of(szulEv, szulHonap, szulNap);
        System.out.println(birthDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, new Locale("hu")));
		
		
        scanner.close();
	}

}
