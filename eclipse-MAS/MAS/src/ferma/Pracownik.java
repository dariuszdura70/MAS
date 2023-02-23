package ferma;



public class Pracownik extends Osoba{
	String stanowisko;
	
	public Pracownik(String firstName, String familyName, Adres adres, int nip,String password,String stanowisko) {
		super(firstName, familyName, adres, nip, password);
		// TODO Auto-generated constructor stub
		this.stanowisko=stanowisko;//argument 
	}

	@Override
	public String toString() {
		return "Pracownik "+ super.toString()+ "[stanowisko=" + stanowisko + "]";
	}
	
	
	
   

}
