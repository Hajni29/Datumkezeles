package hazifeladat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Gy06_01 {

	public static void main(String[] args) {
		// Kérjünk be a felhasználótól egy angol szöveget (lehet több mondat is), majd:
		
		 Scanner sc = new Scanner(System.in);
//       System.out.println("Kérem az angol szöveget!");
//       String text = sc.nextLine();
       String text = "    A pOlIcE dog, also known as K-9 or K9 2019 (a canine dog: police dog), "
       		+ "is a dog specifically trained to assist members of law enforcement. "
       		+ "2019 The most commonly used breeds are German Shepherds and Belgian Malinois, "
       		+ "but several other breeds are represented having some unique talents!         ";
       
       //1/a A felesleges szóközöket távolítsuk el az elejéről/végéről!
       text = text.strip();
       System.out.println(text);

       //1/b Írjuk ki hány mondatot tartalmaz! Figyeljünk, arra, hogy nem csak 
       // pont lehet a mondathatároló!
       int sentenceCounter = 0;
       for(char karakter : text.toCharArray()) {
           if(karakter == '.' || karakter == '!' || karakter == '?') {
               sentenceCounter++;
           }
       }
       System.out.println("Mondatok száma: " + sentenceCounter);

       //1/c Hány darab kis vagy nagy ’a’ betűt tartalmaz?
       int aCounter = 0;
       for(char karakter : text.toCharArray()) {
           if(karakter == 'a' || karakter == 'A') {
               aCounter++;
           }
       }
       System.out.println("Kis vagy nagy 'a' betűk száma: " + aCounter);

       //1/d Írjuk ki a teljes szöveget végig nagybetűsen!
       System.out.println(text.toUpperCase());

       //1/e Írjuk ki a második megadott szót kisbetűsen!
       String[] words = text.split(" ");
       System.out.println(words[1].toLowerCase());

       //1/f Szerepel –e az ’and’ angol szó a megadott szövegben? Amennyiben benne van, 
       //írjuk ki az első előfordulásának indexét!
       boolean containsAnd = text.contains("and");
       System.out.println("A szövegben szerepel az 'and' szó: " + containsAnd);
       if(containsAnd) {
           int indexOfAnd = text.indexOf("and");
           System.out.println("Az 'and' szó indexe: " + indexOfAnd);
       }

       //1/g Ellenőrizzük le, hogy az utolsó karakter pont –e?
       char lastCharacter = text.charAt(text.length() - 1);
       System.out.println("Az utolsó karakter '.': " + (lastCharacter == '.'));

       //1/h Ellenőrizzük le, hogy a szöveg első karaktere nagybetűs –e?
       char firstCharacter = text.charAt(0);
       System.out.println("Az első karakter nagybetűs: " + Character.isUpperCase(firstCharacter));

       //1/i Az összes 2019-es évszámot cseréljük le 2020-ra. A teszteléshez megfelelő bemenetet adjunk meg,
       // melyben többször is szerepel 2019!
       System.out.println(text.replaceAll("2019", "2020"));

       //1/j A betűk hány százaléka mássalhangzó, magánhangzó illetve egyéb karakter?
       String vowels = "aeiouAEIOU"; //magánhangzók
       double vowelCounter = 0;
       int otherCounter = 0;
       for(char karakter : text.toCharArray()) {
           if(vowels.contains(String.valueOf(karakter))) {
               vowelCounter++;
           } else {
               otherCounter++;
           }
       }

       System.out.println("Magánhangzók száma: " + vowelCounter);
       System.out.println("Nem magánhangzók száma: " + otherCounter);

       double average = vowelCounter / text.toCharArray().length * 100;
       System.out.println("A karakterek " + average + " %-a magánhangzó");

	}

}
