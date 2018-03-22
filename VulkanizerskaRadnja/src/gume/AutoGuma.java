package gume;

/**
 * Klasa AutoGuma koja opisuje gumu sa osnovnim njenim karakteristikama.
 * @author Milos Brkic
 * @version 0.1
 */
public class AutoGuma {
	
	/** Marka i model gume. */
	private String markaModel = null;
	
	/** Vrednost precnika gume.*/
	private int precnik = 0;
	
	/** Vrednost sirine gume.*/
	private int sirina = 0;
	
	/** Vrednost visine gume.*/
	private int visina = 0;

	
	/**
	 * Vraca marku i model knjige.
	 * @return markaModel kao String.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja vrednost atributa markaModel na unetu vrednost parametra.
	 * @param markaModel Marka i model koje zelimo dodelimo gumi.
	 * @throws java.lang.RuntimeException ako je parametar markaModel null ili kraci od 3 karaktera.
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	
	/**
	 * Vraca vrednost precnika gume.
	 * @return precnik kao int.
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja vrednost precnika gume na unetu vrednost parametra.
	 * @param precnik Precnik koji zelimo da dodelimo gumi.
	 * @throws java.lang.RuntimeException ako je precnik manji od 13 ili veci od 22.
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost sirine gume.
	 * @return sirina kao int.
	 */
	public int getSirina() {
		return sirina;
	}

	
	/**
	 * Postavlja vrednost sirine gume na unetu vrednost parametra.
	 * @param sirina Sirina koju zelimo da dodelimo gumi.
	 * @throws java.lang.RuntimeException ako je sirina manja od 135 ili veca od 355.
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	
	/**
	 * Vraca vrednost visine gume.
	 * @return visina kao int.
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja vrednost visine gume na unetu vrednost parametra.
	 * @param visina Visina koju zelimo da dodelimo gumi.
	 * @throws java.lang.RuntimeException ako je sirina manja od 25 ili veca od 95.
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Prikazuje opis guma sa njenim atributima.
	 * @return Opis gume sa atributima markaModel, precnik, sirina i visina u jednom String-u.
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi da li je uneti objekat isti kao ovaj objekat.
	 * @param obj Objekat sa kojim se poredi.
	 * @return true ako objekti imaju identicne vrednosti atributa,
	 * false u ostalim slucajevima.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}