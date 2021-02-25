public class Porte {

	public boolean estOuverte = false;
	public String couleur;
	public static double hauteur;

	public void ouvrir() {
		if (estOuverte) {
			System.out.println("La porte est déjà ouverte");
		} else {
			estOuverte = true;
			System.out.println("La porte a été ouverte");
		}
	}

	public void fermer() {
		if (estOuverte) {
			estOuverte = false;
			System.out.println("La porte a été fermé");
		} else {
			System.out.println("La porte est déja fermée");
		}
	}

	public void franchir() {
		if (estOuverte) {
			System.out.println("Franchissement réussi");
		} else {
			System.out.println("La porte est fermée, vous ne pouvez pas passer");
		}
	}

}