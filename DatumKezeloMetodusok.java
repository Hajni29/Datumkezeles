package datumKezeloMetodusok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DatumKezeles {

	public static void main(String[] args) {
		// Java11 óta: Deprecated: Date, Calendar, SimpleDateFormat
		// Helyette java11-től a Time package oszályait kell használni
		// 1.8 óta van benne JRE-ben a Time

		Date datum = new Date();
		// Aktuális dátum
		System.out.println(datum);

		// deprecated java11 óta
//		Date elsoDatum = new Date(2001,1,2);
//		System.out.println(elsoDatum);
		// datum.setDate(22);
		// datum.setYear(2023);

		// SimpleDateFormat
		try {
			Date publishDate = new SimpleDateFormat("yyyy-MM-dd").parse("2012-01-08");
			System.out.println(publishDate);

			Date publishDate2 = new SimpleDateFormat("yyyy/MM/dd").parse("2012/01/10");
			System.out.println(publishDate2);

			SimpleDateFormat sdfObj = new SimpleDateFormat("yyy#MM#dd");
			Date publishDate3 = sdfObj.parse("2012#01#09");
			System.out.println(publishDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Calendar osztály - java11 óta elavult, a háttérben GregorianCalendar-t tölti
		// be
		Calendar calendarObj = Calendar.getInstance(); // aktuális dátum
		System.out.println("Aktuális év: " + calendarObj.get(Calendar.YEAR)); // aktuális év
		System.out.println("Aktuális hónap: " + calendarObj.get(Calendar.MONTH));
		System.out.println("Aktuális nap: " + calendarObj.get(Calendar.DATE));
		System.out.println("Aktuális perc: " + calendarObj.get(Calendar.MINUTE));
		System.out.println("Aktuális mp: " + calendarObj.get(Calendar.SECOND));

		Calendar.getInstance(Locale.US);

		// Feladat01: Írassuk ki a 2 héttel ezelőtti dátumot! Aktuális dátum alapján!
		System.out.println("Feladat01:");
		Calendar aktualisDatum = Calendar.getInstance();
		aktualisDatum.add(Calendar.DATE, -14);
		System.out.println("2 héttel ezelőtti dátum: " + aktualisDatum.getTime());
		// Megjelenítésnél: StringFormat vagy SimpleDateFormat

		// System.out.println(aktualisDatum.getTime().getYear()); //deprecated
		System.out.println("Év: " + aktualisDatum.get(Calendar.YEAR));
		System.out.println("Hónap: " + aktualisDatum.get(Calendar.MONTH));
		System.out.println("Nap: " + aktualisDatum.get(Calendar.DAY_OF_MONTH));

		int honapSorSzam = aktualisDatum.get(Calendar.MONTH);
		honapSorSzam += 1;
		System.out.println("hónapsorszám: " + honapSorSzam);

		// Feladat02: Kérjünk be két dátumot, majd döntsük el, hogy melyik
		// korábbi/későbbi,
		// esetleg nem azonosak!
		System.out.println();
		System.out.println("Feladat02 - dátumok összehasonlítása");

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Kérem adja meg az első dátum adatait egész számokkal: ");
			System.out.print("Év (pld: 2001): ");
			int evElso = Integer.parseInt(br.readLine());
			System.out.print("Hónap (pld: 12): ");
			int honapElso = Integer.parseInt(br.readLine());
			System.out.print("Nap (pld. 8): ");
			int napElso = Integer.parseInt(br.readLine());

			System.out.println("Kérem adja meg az második dátum adatait egész számokkal: ");
			System.out.print("Év (pld: 2001): ");
			int evMasodik = Integer.parseInt(br.readLine());
			System.out.print("Hónap (pld: 12): ");
			int honapMasodik = Integer.parseInt(br.readLine());
			System.out.print("Nap (pld. 8): ");
			int napMasodik = Integer.parseInt(br.readLine());

			Calendar elsoDatum = Calendar.getInstance();
			elsoDatum.set(evElso, honapElso, napElso);

			Calendar masodikDatum = Calendar.getInstance();
			masodikDatum.set(evMasodik, honapMasodik, napMasodik);

			// rossz megoldás - nincs ilyen működés
			// Relációs jelek dátumoknál nem működnek < > == !=
//			if (elsoDatum>masodikDatum) {
//				System.out.println("Az első dátum volt később...");
//			}

			if (elsoDatum.after(masodikDatum)) {
				System.out.println("Első dátum későbbi, mint a második");
			} else if (elsoDatum.before(masodikDatum)) {
				System.out.println("Első dátum korábbi, mint a második");
			} else {
				System.out.println("Azonos dátumok");
			}
			if (elsoDatum.compareTo(masodikDatum) < 0) {
				System.out.println("compareTo: Az első dátum korábbi, mint a második!!!");
			} else if (elsoDatum.compareTo(masodikDatum) > 0) {
				System.out.println("compareTo: Az első dátum későbbi, mint a második!!!");
			} else if ((elsoDatum.compareTo(masodikDatum) == 0)) {
				System.out.println("compareTo: Azonos dátumok...");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// java11 óta a Time package javasolt (java8 is lehet)
		LocalDate localDate = LocalDate.now();
		System.out.println("Aktuális dátum - LocalDate: " + localDate);
		System.out.println(LocalDate.of(2015, 02, 20));
		// 2015-02-20 ISO szabvány szerinti dátummegjelenítés, mehet az DB-be

		// LocalDate regDate = LocalDate.parse("2015-02-30"); //DateTimeParseException
		LocalDate regDate = LocalDate.parse("2016-02-29"); // jó
		System.out.println("Regisztráció ideje: " + regDate);

		regDate = regDate.plus(Period.ofDays(90));
		System.out.println("Regisztráció ideje 90 nap után: " + regDate); // 2016-05-29

		System.out.println(regDate.isAfter(localDate)); // false
		System.out.println(regDate.isBefore(localDate)); // true

		// Feladat03: Két dátum közötti különbség napokban
		System.out.println("Feladat03: Dátumok közötti különbség: ");
		LocalDate kezdoDatum = LocalDate.of(2015, 02, 20);
		LocalDate vegDatum = LocalDate.of(2017, 03, 28);

		// System.out.println(kezdoDatum.getMonth());
		int elteltNapokSzam = Period.between(kezdoDatum, vegDatum).getDays();
		System.out.println("Eltelt napok száma: " + elteltNapokSzam);
		// x év, y hónap és z nap a különbég

		LocalDate date01 = LocalDate.of(2020, 9, 11);
		LocalDate date02 = LocalDate.of(2021, 8, 10);
		Period period = Period.between(date01, date02);
		int years = Math.abs(period.getYears());
		int months = Math.abs(period.getMonths());
		int days = Math.abs(period.getDays());
		System.out.println("Év: " + years);
		System.out.println("Hónap: " + months);
		System.out.println("Nap: " + days);

		System.out.println("Feldat04: idők közötti különbség:");
	    LocalDateTime now = LocalDateTime.now();
	    LocalDateTime sixMinutesBehind = now.minusMinutes(6);

	    Duration duration = Duration.between(now, sixMinutesBehind);
	    long diff = Math.abs(duration.toMinutes());
		System.out.println(diff);
		
		@SuppressWarnings("unused")
		TimeZone tz = TimeZone.getTimeZone("GMT+9:00");
		Locale loc = new Locale("en", "US","US");
		Calendar calendar2 = Calendar.getInstance(loc);		
		GregorianCalendar gregorianCalendar = (GregorianCalendar)calendar2; 
		System.out.println(gregorianCalendar);
		System.out.println(gregorianCalendar.get(Calendar.YEAR));
		System.out.println(gregorianCalendar.get(Calendar.HOUR));
		
		//Összefoglalva, ezeket az oszályokat használjuk java11-ben
		//LocalDate
		//GregorianCalendar
		//TimeZone
		//Time
		//Külső könyvtárak: Date4J, JodaTime
		
	}
}
