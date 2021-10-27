

/** Représente un moteur à essence */
public class MoteurEssence extends VoitureMontee{
	/** Décore la voiture spécifiée avec un moteur à essence */
	public MoteurEssence(Voiture voiture) {
		super(voiture);
	}

	
	public float getMasse() {
		return  super.getMasse() + 300;
	}

	
	public float getPuissanceMoteur() {return super.getPuissanceMoteur() + 115;	}

	public float getPrix() {
		return super.getPrix() + 4000;
	}

	public float getRegimeOptimal() {
		return super.getRegimeOptimal() + 4000;
	}


		public String toString() {
		return super.toString() + ", un MoteurEssence";
	}
}
