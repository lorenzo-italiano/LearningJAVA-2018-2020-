

/** Représente un moteur diesel */
public class MoteurDiesel extends VoitureMontee {
	/** Décore une voiture avec un moteur diesel */
	public MoteurDiesel(Voiture voiture) {
		super(voiture);
	}

	public float getMasse() {
		return super.getMasse() + 500;

	}

	public float getPuissanceMoteur() {
		return super.getPuissanceMoteur() + 150;

	}

	public float getRegimeOptimal() {
		return super.getRegimeOptimal() + 2000;

	}


	public float getPrix() {
		return super.getPrix() + 6000;
	}

	public String toString() {
		return super.toString() + ", un MoteurDiesel";
	}
}
