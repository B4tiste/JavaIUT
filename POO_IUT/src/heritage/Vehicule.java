package heritage;

public class Vehicule {

	private double vitesse = 0.0;

	public double getVitesse() {
		return vitesse;
	}

	public void setVitesse(double vitesse) {
		this.vitesse = vitesse;
	}

	public void faireDuBruit() {
		System.out.println("Je roule à " + vitesse + " km/h");
	}
}
