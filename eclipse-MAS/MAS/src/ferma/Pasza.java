package ferma;

import java.time.LocalDate;
import java.util.Date;

public abstract class Pasza {
	String typPaszy;
	double iloscNaDob�;
	double bialko;
	double energia;
	double cenaZaTon�;
	String producent;
	double zapasWTonach;
	int nrDniaPrzydatnosci;
	public Pasza(String typPaszy, double bialko, double energia, double cenaZaTon�, String producent) {
		super();
		this.typPaszy = typPaszy;
		this.bialko = bialko;
		this.energia = energia;
		this.cenaZaTon� = cenaZaTon�;
		this.producent = producent;
	}
	public double getIloscNaDob�() {
		return iloscNaDob�;
	}
	public void setIloscNaDob�(double iloscNaDob�) {
		this.iloscNaDob� = iloscNaDob�;
	}
	public double getCenaZaTon�() {
		return cenaZaTon�;
	}
	public void setCenaZaTon�(double cenaZaTon�) {
		this.cenaZaTon� = cenaZaTon�;
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
