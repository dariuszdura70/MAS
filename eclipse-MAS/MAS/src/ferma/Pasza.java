package ferma;

import java.time.LocalDate;
import java.util.Date;

public abstract class Pasza {
	String typPaszy;
	double iloscNaDobÍ;
	double bialko;
	double energia;
	double cenaZaTonÍ;
	String producent;
	double zapasWTonach;
	int nrDniaPrzydatnosci;
	public Pasza(String typPaszy, double bialko, double energia, double cenaZaTonÍ, String producent) {
		super();
		this.typPaszy = typPaszy;
		this.bialko = bialko;
		this.energia = energia;
		this.cenaZaTonÍ = cenaZaTonÍ;
		this.producent = producent;
	}
	public double getIloscNaDobÍ() {
		return iloscNaDobÍ;
	}
	public void setIloscNaDobÍ(double iloscNaDobÍ) {
		this.iloscNaDobÍ = iloscNaDobÍ;
	}
	public double getCenaZaTonÍ() {
		return cenaZaTonÍ;
	}
	public void setCenaZaTonÍ(double cenaZaTonÍ) {
		this.cenaZaTonÍ = cenaZaTonÍ;
	}
	public double getZapasWTonach() {
		return zapasWTonach;
	}
	public  void dodajPartiePaszy(int nrDniaPrzydatnosci, double ilosc ) {
		zapasWTonach+=ilosc;
		this.nrDniaPrzydatnosci=nrDniaPrzydatnosci;
	}

	LocalDate date = LocalDate.now();
	int dayOfYear = date.getDayOfYear();
	
	int ileDniPrzydatna() {
		return nrDniaPrzydatnosci - dayOfYear;  //atrybut  pochodny wyliczany
		
	}
	
	
}
