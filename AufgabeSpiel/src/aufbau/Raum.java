package aufbau;
import java.util.*;

public class Raum {
	
	private HashMap<String, Raum> ausgaenge;		//oder auch t�r
	private HashMap<Gegenstand, String> itemList;
	private String kurzBeschreibung;
	private String langBeschreibung;
	private String name;
	private Random richtung = new Random();
	
	public Raum() {
		
		ausgaenge.put("Nord",new Raum("Eingang", "Flur", "Das ist der Eingang des Hauses")); 
		ausgaenge.put("S�d",new Raum("Kammer 01", "Kleine, dunkle kammer", "Der dunkelste Ort des hauses"));
		ausgaenge.put("West",new Raum("Empfang", "gro�er heller Raum", "Empfangstheke"));
		ausgaenge.put("Ost",new Raum("K�che", "K�cheninventar", "dunkel"));
		ausgaenge.put("Nord",new Raum("Schlafzimmer","Bett", "Heller Raum"));
		ausgaenge.put("S�d",new Raum("BilliardRaum", "hat einen gro�en BilliardTisch", "heller Raum"));
		ausgaenge.put("West",new Raum("EssZimmer", "Gro�er EssTisch", "dunkler Raum"));
		ausgaenge.put("Ost",new Raum("ArbeitesZimmer", "Schreibtisch", "Heller Raum"));
		ausgaenge.put("Nord",new Raum("WaschRaum","Waschmaschine","dunkler Raum"));
		ausgaenge.put("S�d",new Raum("Kammer 02", "kleiner Raum", "dunkel"));
		ausgaenge.put("West",new Raum("Wohnzimmer","gro�er Ausstattung", "heller Raum"));
		ausgaenge.put("Ost",new Raum("Kammer 03", "Mit Lebensmitteln gef�llt", "kleiner heller Raum"));
		
		
		
	}
	
	public Raum(String name, String kurzBeschreibung, String langBeschreibung) {
		this.name = name;
		this.kurzBeschreibung= kurzBeschreibung;
		this.langBeschreibung=langBeschreibung;
	}

	public Raum addAusgang(Raum raum, String ausgang)
	{
		return null;
	}
	
	public HashMap<String, Raum>  getAusgaenge()
	{
		return null;
	}
	
	public Raum getAusgang(String ausgang)
	{
		return null;
	}

	/**
	 * @return the itemList
	 */
	public HashMap<Gegenstand, String> getItemList() {
		return itemList;
	}

	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(HashMap<Gegenstand, String> itemList) {
		this.itemList = itemList;
	}

	/**
	 * @return the kurzBeschreibung
	 */
	public String getKurzBeschreibung() {
		return kurzBeschreibung;
	}

	/**
	 * @param kurzBeschreibung the kurzBeschreibung to set
	 */
	public void setKurzBeschreibung(String kurzBeschreibung) {
		this.kurzBeschreibung = kurzBeschreibung;
	}

	/**
	 * @return the langBeschreibung
	 */
	public String getLangBeschreibung() {
		return langBeschreibung;
	}

	/**
	 * @param langBeschreibung the langBeschreibung to set
	 */
	public void setLangBeschreibung(String langBeschreibung) {
		this.langBeschreibung = langBeschreibung;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param ausgaenge the ausgaenge to set
	 */
	public void setAusgaenge(HashMap<String, Raum> ausgaenge) {
		this.ausgaenge = ausgaenge;
	}
	
	
}
