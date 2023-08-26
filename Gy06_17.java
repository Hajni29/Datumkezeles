package hazifeladat;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Random;

public class Gy06_17 {

	public static void main(String[] args) {
		// Hozzunk létre 2 véletlen dátumot 2000-01-01 és 2020-01-01 között, majd írjuk ki, melyik a
		// korábbi, későbbi dátum!
		Random random = new Random();
		LocalDate firstDate = LocalDate.of(random.nextInt(20) + 2000, 
				random.nextInt(12) + 1, random.nextInt(30) + 1);
        LocalDate secondDate = LocalDate.of(random.nextInt(20) + 
        		2000, random.nextInt(12) + 1, random.nextInt(30) + 1);
        System.out.println(firstDate);
        System.out.println(secondDate);
        if (firstDate.isAfter(secondDate))
        {
            System.out.println(firstDate + " a nagyobb");
        }
        else if(secondDate.isAfter(firstDate))
        {
            System.out.println(secondDate + " a nagyobb");
        } else {
            System.out.println("A két dátum egyenlő");
        }
		
		
	}

}
