package hazifeladat;

public class Gy06_05 {

	public static void main(String[] args) {
		
		
		//5 Kérjük be a felhasználótól gyümölcsneveket, majd tároljuk le egy tömbbe. 
		// Fűzzük össze az egyes elemeket pontosvessző karakterrel egy darab string típusú változóba, 
		// majd írjuk ki
        
		String[] fruits = {"alma", "körte", "barack", "szilva"};
        String join = String.join(";", fruits);
        System.out.println(join);
		
	}

}
