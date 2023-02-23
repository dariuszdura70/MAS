/**
 * 
 */
package ferma;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s1141
 *
 */
public class Osoba {

	public Osoba(String firstName, String familyName, Adres adres, int nip,String password) {
		super();
		this.firstName = firstName;
		this.familyName = familyName;
		this.adres = adres;
		this.nip = nip;
		this.password=password;
		extent.add(this);
	}
	/**
	 * @param args
	 */
	private String firstName;  //argumenty obiektu
	private String familyName;
	private Adres adres;
	private int nip;
	private String password;
	
	private static List<Osoba> extent = new ArrayList<>();
	
	public static void addOsoba(Osoba osoba) {
		extent.add(osoba);
		System.out.println("Osoba zosta³a dodana do listy");
	} 
	
	public static void removeOsoba(Osoba osoba) {
		extent.remove(osoba);
		System.out.println("Osoba zosta³a usuniêta z listy");
	}
	
	public static void showExtent() {
		System.out.println("Drukujê liste osób");
		for (Osoba osoba : extent) {
			System.out.println(osoba);
		}
		
		
		}

	@Override
	public String toString() {
		return "Osoba [firstName=" + firstName + ", familyName=" + familyName + ", adres=" + adres + ", nip=" + nip
				+ ", password=" + password + "]";
	}
	
	
	

	
}
