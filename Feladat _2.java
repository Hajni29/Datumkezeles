package hazifeladat;

import java.util.Random;

public class Gy06_02 {

	public static void main(String[] args) {
		// Kérjünk be egy vezetéknevet és keresztnevet, majd készítsünk 
		// felhasználónevet a két adatból a következők szerint:
		// a. A keresztnév és vezetéknév is legyen kisbetű!
		// b. Ékezeteket nem tartalmazhat!
		// c. A vezetéknév első 3 karaktere után alulvonás keresztnév 3 karakter végül 
		// egy 3 jegyű véletlen szám. pld. Megadott név: Horváth Ábel  felhasználónév: hor_abe541
		

		 String vezeteknev = "Nagy";
	        String keresztnev = "Ákos";
	        vezeteknev = vezeteknev.toLowerCase();
	        keresztnev = keresztnev.toLowerCase();
	        vezeteknev = vezeteknev
	                .replaceAll("á", "a")
	                .replaceAll("é", "e")
	                .replaceAll("ú", "u")
	                .replaceAll("ü", "u")
	                .replaceAll("ű", "u")
	                .replaceAll("ö", "o")
	                .replaceAll("ő", "o");
	        keresztnev = keresztnev
	                .replaceAll("á", "a")
	                .replaceAll("é", "e")
	                .replaceAll("ú", "u")
	                .replaceAll("ü", "u")
	                .replaceAll("ű", "u")
	                .replaceAll("ö", "o")
	                .replaceAll("ő", "o");
	        Random random = new Random();
	        String username = String.format("%s_%s%d", vezeteknev.substring(0, 3), keresztnev.substring(0, 3), (random.nextInt(900) + 100));
	        System.out.println("Generált felhasználónév: " + username);
	     // d. Hozzunk létre egy gmail-es email címet is a felhasználónévvel!
	        System.out.println("G-mailes email cím: " + String.format("%s@gmail.com", username));
		
		
	}

}