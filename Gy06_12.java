package hazifeladat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Gy06_12 {

	public static void main(String[] args) {
		// Készítsük leltárszámgeneráló alkalmazást! A következő formátumot alkalmazzuk: 
		// FWA85741_20201116 Az első három karakter véletlenszerű, angol nagybetűk, a következő 5
		// karakter decimális szám véletlenszerű 0-9 között, majd alulvonást követően az aktuális dátum
		// szerepel.
		
		Random random = new Random();
		String[] letters = {"A", "B", "G", "H", "I", "N"};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String generatedValue = "";
        for (int i = 0; i < 3; ++i)
        {
            generatedValue = generatedValue.concat(letters[random.nextInt(6)]);
        }

        for (int i = 0; i < 5; ++i)
        {
            generatedValue = generatedValue.concat(String.valueOf(numbers[random.nextInt(10)]));
        }

        generatedValue = generatedValue.concat("_");
        LocalDate today = LocalDate.now(); //2023-04-23
//        generatedValue = generatedValue.concat(today.toString().replaceAll("-", ""));
        generatedValue = generatedValue.concat(today.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
        System.out.println("A generált leltárszám: " + generatedValue);
		
		
	}

}
