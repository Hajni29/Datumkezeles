package hazifeladat;

import java.util.Arrays;
import java.util.Random;

public class Gy06_14 {

	public static void main(String[] args) {
		// Tömbkezelő metódussal rendezzünk növekvő sorrendbe egy 15 elemszámú véletlen számokat 
		// (1-50 között) tartalmazó tömböt!
		
		Random random = new Random();
		int[] numbers = new int[15];
		
		for (int i = 0; i < args.length; i++) {
			numbers[i] = random.nextInt(50)+1;
		}
		Arrays.sort(numbers);
        for (int tmp : numbers)
        {
            System.out.print(tmp + " ");
        }
        System.out.println();
	}

	
	}


