package ferma;

public class Main {

	public static void main(String[] args) {
		// przyk�adowe dane 
		
		new Pracownik("Maniek", "Janicki", null, 72398765, "probny","obs�uga mieszalni");
		new Pracownik("Jan","Kowal",null,182393483,"probny","obs�uga porod�wki");
		new Pracownik("Zenon", "Kowalski", null, 34567890, "password","ob�uga tuczarni");
		
		Osoba.showExtent();
		
		Pracownik nowy = new Pracownik("Jan", "Nowak", null, 987658990,"tymczasowy","dopasowywanie do stanowisk ");
		
		Osoba.showExtent();
		
		Osoba.removeOsoba(nowy);
		
		Osoba.showExtent();
		

	}

}
