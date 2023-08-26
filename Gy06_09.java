package hazifeladat;

import java.util.regex.Pattern;

public class Gy06_09 {

	public static void main(String[] args) {
		// Kérjünk be egy emailcímet, majd döntsük el, hogy tartalmazza –e a @ jelet 
		// és megfelelő –e a formátum  pld. tesztemail@domain.hu (szoveg@szoveg.szoveg)!
			
		
		String email = "kiss.anna@gmail.com";
		String regex = "\\D+@\\D+\\.\\D+";
        System.out.println(Pattern.matches(regex, email));
	}

}
