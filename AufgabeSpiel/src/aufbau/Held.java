package aufbau;
import java.util.*;


public class Held 
{
	private LinkedList<Gegenstand> inventar;
	private int lebensPunkte;
	private String name;
	private int atk;
	
	
	public Held(String name, int leben, int atkpts) {
		this.name = name;
		this.lebensPunkte=leben;
		this.atk=atkpts;
	}
	
	public LinkedList<Gegenstand> getInventar()
	{
		return null;
	}

	/**
	 * @return the lebensPunkte
	 */
	public int getLebensPunkte() {
		return lebensPunkte;
	}

	/**
	 * @param lebensPunkte the lebensPunkte to set
	 */
	public void setLebensPunkte(int lebensPunkte) {
		this.lebensPunkte = lebensPunkte;
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
	 * @param inventar the inventar to set
	 */
	public void setInventar(LinkedList<Gegenstand> inventar) {
		this.inventar = inventar;
	}
	
	
	
}

	