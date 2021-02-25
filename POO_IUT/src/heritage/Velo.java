package heritage;

public class Velo extends Vehicule {

	@Override
	public void setVitesse(double vitesse) {
		if (vitesse >= 60) {
			System.out.println("Doucement fada ! Je suis en v�lo !");
			vitesse = 60;
		} else if (vitesse < 0) {
			System.out.println("De la marche arri�re sur un v�lo ?");
			vitesse = 0;
		}
		super.setVitesse(vitesse);
	}

	@Override
	public void faireDuBruit() {
		super.faireDuBruit();
		System.out.println("Dring dring !");
	}

}
