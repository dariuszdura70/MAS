package ferma;

import java.time.LocalDate;
import java.util.Date;

public abstract class Pasza {
	String typPaszy;
	double iloscNaDobê;
	double bialko;
	double energia;
	double cenaZaTonê;
	String producent;
	double zapasWTonach;
	int nrDniaPrzydatnosci;
	public Pasza(String typPaszy, double bialko, double energia, double cenaZaTonê, String producent) {
		super();
		this.typPaszy = typPaszy;
		this.bialko = bialko;
		this.energia = energia;
		this.cenaZaTonê = cenaZaTonê;
		this.producent = producent;
	}
	public double getIloscNaDobê() {
		return iloscNaDobê;
	}
	public void setIloscNaDobê(double iloscNaDobê) {
		this.iloscNaDobê = iloscNaDobê;
	}
	public double getCenaZaTonê() {
		return cenaZaTonê;
	}
	public void setCenaZaTonê(double cenaZaTonê) {
		this.cenaZaTonê = cenaZaTonê;
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
