package aufbau;

public class Game {
	
	private Raum aktuellerRaum;
	private Held held;
	private Parser parser;
	
	
	private void createWorld() {
		
		new Raum();
	}
	
	public Game() {
		createWorld();
	}
	
	private void gameMenue() {
		
	}
	
	public static void goRaum(String goRaum) {
		
	}
	
	
	private void init() {
		
	}
	
	public static void raumBeschreibung() {
		
	}

	/**
	 * @return the aktuellerRaum
	 */
	public Raum getAktuellerRaum() {
		return aktuellerRaum;
	}

	/**
	 * @param aktuellerRaum the aktuellerRaum to set
	 */
	public void setAktuellerRaum(Raum aktuellerRaum) {
		this.aktuellerRaum = aktuellerRaum;
	}

	/**
	 * @return the held
	 */
	public Held getHeld() {
		return held;
	}

	/**
	 * @param held the held to set
	 */
	public void setHeld(Held held) {
		this.held = held;
	}

	/**
	 * @return the parser
	 */
	public Parser getParser() {
		return parser;
	}

	/**
	 * @param parser the parser to set
	 */
	public void setParser(Parser parser) {
		this.parser = parser;
	}
	
	
}
