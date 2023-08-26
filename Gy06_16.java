package hazifeladat;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Gy06_16 {

	public static void main(String[] args) {
		// Kérjünk be a felhasználótól a születési dátumát, majd döntsük el, hogy nagykorú –e?
		
		
		System.out.println("Kérem adjon meg egy születési dátumot: ");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Adja meg a születési évet (pl.: 1990): ");
		int szulEv = Integer.parseInt(scanner.nextLine());
		System.out.print("Adja meg a születési hónapot (pl.: 03): ");
		int szulHonap = Integer.parseInt(scanner.nextLine());
		System.out.print("Adja meg a születési napot (pl.: 08): ");
		int szulNap = Integer.parseInt(scanner.nextLine());
		
	    LocalDate birthDate = LocalDate.of(szulEv, szulHonap, szulNap);
		
	     //String birthDate1 = scanner.nextLine();
		//String szulDatum = scanner.nextLine(); 
		
		// String date = "1994-09-01";
        int years = (Period.between(birthDate, LocalDate.now()).getYears());
        System.out.println("Nagykorú: " + (years >= 18));
	}
}
	
       
