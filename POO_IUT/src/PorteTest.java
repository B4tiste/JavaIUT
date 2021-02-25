
public class PorteTest {

	public static void main(String[] args) {

		Porte porte_un = new Porte();
		Porte porte_deux = new Porte();

		porte_un.franchir();
		porte_un.fermer();
		porte_un.ouvrir();
		porte_un.ouvrir();
		porte_un.franchir();
		porte_un.fermer();
		porte_un.fermer();

		porte_un.couleur = "Verte";

		System.out.println("La porte 1 est " + porte_un.couleur);

		porte_un.hauteur = 2;
		System.out.println("La porte 1 fait " + porte_un.hauteur + "m");
		porte_deux.hauteur = 3;
		System.out.println(porte_un.hauteur);
		System.out.println(porte_deux.hauteur);

	}

}
