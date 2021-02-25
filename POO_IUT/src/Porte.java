public class Porte {

	public boolean estOuverte = false;
	public String couleur;
	public static double hauteur;

	public void ouvrir() {
		if (estOuverte) {
			System.out.println("La porte est d�j� ouverte");
		} else {
			estOuverte = true;
			System.out.println("La porte a �t� ouverte");
		}
	}

	public void fermer() {
		if (estOuverte) {
			estOuverte = false;
			System.out.println("La porte a �t� ferm�");
		} else {
			System.out.println("La porte est d�ja ferm�e");
		}
	}

	public void franchir() {
		if (estOuverte) {
			System.out.println("Franchissement r�ussi");
		} else {
			System.out.println("La porte est ferm�e, vous ne pouvez pas passer");
		}
	}

}