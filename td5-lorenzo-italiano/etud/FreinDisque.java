
/** Représente des freins à disque */
public class FreinDisque extends VoitureMontee{

	/** Décore une voiture avec des freins à disque */
	public FreinDisque(Voiture voiture) {
		super(voiture);
	}

	public float getPrix() {
		return super.getPrix() + 150;
	}

	public float getMasse() {
		return super.getMasse() + 3;

	}

	public float getForceFreinageCst() {
		return super.getForceFreinageCst() + 7.95f; // Pour obtenir une distance de freinage cohérente avec la réalité

	}



	public String toString() {
		return super.toString() + ", un Freins disque";
	}
}
