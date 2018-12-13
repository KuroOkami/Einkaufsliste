package aufbau;

public class Gegenstand {
	
	private String kurzBeschreibung;
	private String langBeschreibung;
	private boolean raetsel;
	private boolean aufhebbar;
	private String frage;
	private String antwort;

	public String getKurzBeschreibung() {
		return kurzBeschreibung;
	}

	public void setKurzBeschreibung(String kurzBeschreibung) {
		this.kurzBeschreibung = kurzBeschreibung;
	}
	public String getLangBeschreibung() {
		return langBeschreibung;
	}

	public void setLangBeschreibung(String langBeschreibung) {
		this.langBeschreibung = langBeschreibung;
	}
	
	public boolean isRaetsel() {
		return raetsel;
	}
	
	public void setRaetsel(boolean raetsel) {
		this.raetsel = raetsel;
	}
	
	public String getFrage() {
		return frage;
	}
	
	public void setFrage(String frage) {
		this.frage = frage;
	}
	
	public String getAntwort() {
		return antwort;
	}
	
	public void setAntwort(String antwort) {
		this.antwort = antwort;
	}
	
	public boolean isAufhebbar() {
		return aufhebbar;
	}
	
	public void setAufhebbar(boolean aufhebbar) {
		this.aufhebbar = aufhebbar;
	}
	
	

	
}
