

/** Représente des freins à courant de foucault */
public class FreinFoucault extends VoitureMontee {

	/** Décore une voiture avec des freins à disque */
	public FreinFoucault(Voiture voiture) {
		super(voiture);
	}

	public float getPrix() {
		return super.getPrix() + 500;

	}

	public float getMasse() {
		return super.getMasse() + 2;

	}

	public float getCoeffFreinageProp() {
		return super.getCoeffFreinageProp() + 0.5f;

	}


	public String toString() {
		return super.toString() + ", un Frein Foucault";
	}
}
