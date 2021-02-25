package heritage;

public class VoitureAutomatique extends Voiture {
	private int rapportDeVitesse = 1;

	public int getRapportDeVitesse() {
		return rapportDeVitesse;
	}

	@Override
	public void setVitesse(double vitesse) {
		rapportDeVitesse = Math.min(5, (int) (vitesse / 20) + 1);
		super.setVitesse(vitesse);
	}

	@Override
	public void faireDuBruit() {
		super.faireDuBruit();
		System.out.println("Et en plus je roule en vitesse : " + rapportDeVitesse);
	}
}