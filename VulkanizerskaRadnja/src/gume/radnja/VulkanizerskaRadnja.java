package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;


/**
 * Klasa VulkanizerskaRadnja koja ima listu guma.
 * @author Milos Brkic
 * @version 0.1
 */
public class VulkanizerskaRadnja {
	
	/** Lista guma. */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	
	/**
	 * U listu guma se dodaje guma koje se prosledjuje kao parametar.
	 * @param a guma koje treba da se doda u listu.
	 * @throws java.lang.NullPointerException ako je uneta guma null.
	 * @throws java.lang.RuntimeException ako uneta guma vec postoji u listi.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		
		gume.addFirst(a);
	}

	/**
	 * Pronalazi i vraca sve gume u listi koje imaju marku i model koje se unose preko parametra.
	 * @param markaModel Marka i model guma koje se pretrazuju.
	 * @return listu guma kao LinkedList.
	 * null ako je uneti String null.
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel()!= null && gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));

		return novaLista;
	}
}