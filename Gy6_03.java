package hazifeladat;

import java.util.Random;

public class Gy6_03 {
	

	public static void main(String[] args) {
		// Készítsünk jelszógeneráló alkalmazást! Kérjük be, hogy milyen hosszú jelszót szeretnénk! 
		//Csak az angol ABC betűit és számokat tartalmazhat! 
		//Speciális karakterek közül csak alulvonás szerepelhet benne! Kötelezően min. 2 szám, 
		//legalább 1 nagybetű és 1 speciális karakter legyen benne!
		
	Random random = new Random();
	int passzHossz = passHosszBekeres();
	System.out.println(passGenerator(passzHossz));
	
	
		
			



	}

	private static char[] passGenerator(int passzHossz) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int passHosszBekeres() {
		// TODO Auto-generated method stub
		return 0;
	}

}
