package hazifeladat;

public class Gy06_07 {

	public static void main(String[] args) {
		// Döntsük el egy szövegről, hogy palidrome –e! Visszafelé azonos: A kupa apuka.
		// (kisbetű/nagybetű nem számít)
		
		
		String text = "A Kupa apuka";
        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        boolean palindrome = true;
        for (int i = 0; i < text.length() / 2; ++i)
        {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
            {
                palindrome = false;
                break;
            }
        }
        System.out.println("A szöveg palindrom: " + palindrome);

	}

}
