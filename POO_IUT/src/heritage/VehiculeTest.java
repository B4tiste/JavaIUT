package heritage;

public class VehiculeTest {

	public static void main(String[] args) {
		Vehicule vehi = new Vehicule();
		Velo bike = new Velo();

		vehi.setVitesse(20);

		System.out.println("Vitesse vehcule : " + vehi.getVitesse());

		vehi.faireDuBruit();

		bike.setVitesse(70);

		bike.faireDuBruit();

		// Appel de la m�thode gaetVitesse pour dans la super classe VEHICULE, classe
		// m�re de VELO
		System.out.println("Vitesse velo : " + bike.getVitesse());
	}

}
