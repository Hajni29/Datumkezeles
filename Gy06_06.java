package hazifeladat;

import java.util.Random;

public class Gy06_06 {

	public static void main(String[] args) {
		// Kérjünk be a felhasználótól egy számot, majd állítsunk elő egy ilyen 
		//hosszú véletlen karakterekből álló szöveget. A lehetséges karakterek között angol betűk 
		//(kis/nagy), számok és a következő speciális karakterek is szerepelhetnek: * / - ! ?.
		Random random = new Random();
		int number = 10;
        char[] characters = {'o','1','i','R','3','!','q','M','-','?'};
        String generatedValue = "";
        for(int i=0;i<number;++i) {
            int randomCharacterIndex = random.nextInt(10);
            generatedValue = generatedValue.concat(String.valueOf(characters[randomCharacterIndex]));
        }
		
        
      //6/a Írjuk ki a generált szöveget!
        System.out.println("Generált szöveg: " + generatedValue);
        
        //6/b Hány darab speciális karakter van a generált szövegben?
        int specCounter = 0;
        for(char karakter : generatedValue.toCharArray()) {
            if(karakter == '!' || karakter == '-' || karakter == '?') {
                specCounter++;
            }
        }
        System.out.println("Speciális karakterek száma: " + specCounter);

        //6/c Döntsük el, hogy szerepel –e benne a ? karakter!
        System.out.println("Benne van a '?' karakter: " + generatedValue.contains("?"));

        //6/d Alakítsuk a teljes szöveget nagybetűssé!
        System.out.println(generatedValue.toUpperCase());
        
        //6/e Alakítsuk a teljes szöveget kisbetűssé!
        System.out.println(generatedValue.toLowerCase());
        
        //6/f Melyik indexen szerepel benne az ’e’ betű? 
        // Amennyiben nincs a generált karakterek között, akkor erről is tájékoztassuk a felhasználót!
        int indexOf = generatedValue.indexOf("e");
        if(indexOf != -1) {
            System.out.println("'e' index: " + indexOf);
        } else {
            System.out.println("Nincs benne 'e'");
        }

        //6/g Cseréljünk ki minden speciális karaktert ’#’ –re!
        System.out.println(generatedValue.replaceAll("!", "#").replaceAll("\\?", "#").replaceAll("-", "#"));

        //6/h Az első karakter a szövegben kis vagy nagybetű (esetleg speciális karakter)?
        System.out.println("Az 1. karakter nagy: " + Character.isUpperCase(generatedValue.charAt(0)));
        
        // 6/ j Az utolsó karakter szám vagy szöveg (esetleg speciális karakter)?
        System.out.println("Az utolsó karakter szám: " + Character.isDigit(generatedValue.charAt(0)));
    }
	
	}


