package shopping;

public class ShoppingListTest {

	public static void main(String[] args) {

		ShoppingListItem banane = new ShoppingListItem("Banane");
		ShoppingListItem pomme = new ShoppingListItem("Pomme");
		ShoppingListItem haricot = new ShoppingListItem("Haricot");
		ShoppingListItem poivron = new ShoppingListItem("Poivron");
		ShoppingListItem broccoli = new ShoppingListItem("Broccoli");

		ShoppingList liste_fruits = new ShoppingList();
		ShoppingList liste_legumes = new ShoppingList();

		liste_fruits.add(banane);
		liste_fruits.add(pomme);
		liste_legumes.add(haricot);
		liste_legumes.add(poivron);
		liste_legumes.add(broccoli);

		/*
		 * for (int i = 0; i < liste_fruits.getItemCount(); i++) {
		 * System.out.println(liste_fruits.getItem(i).getDescription()); }
		 */

		// Les courses n'ont pas été faites

		System.out.println("Contenu de la liste de fruits : ");
		for (ShoppingListItem item : liste_fruits.getItems()) { // utilisation du foreach pour traquer les elements
																// d'une lsite
			System.out.println(item.getDescription());
		}

		System.out.println("Taille de la liste de fruits : " + liste_fruits.getItemCount());

		System.out.println("\n");

		System.out.println("Contenu de la liste de legumes : ");
		for (ShoppingListItem item : liste_legumes.getItems()) { // utilisation du foreach pour traquer les elements
																	// d'une lsite
			System.out.println(item.getDescription());
		}

		System.out.println("Taille de la liste de fruits : " + liste_legumes.getItemCount());

		// Les courses sont faites

		System.out.println("====================");
		System.out.println("Pendant les courses, on trouve les pommes, haricots et broccolis, donc on les coche : \n");

		liste_fruits.getItem(1).toggleCheck();
		liste_legumes.getItem(0).toggleCheck();
		liste_legumes.getItem(1).toggleCheck();

		for (ShoppingListItem item : liste_fruits.getItems()) { // utilisation du foreach pour traquer les elements
			// d'une lsite
			if (item.isChecked()) {
				System.out.println(item.getDescription() + " trouvés, donc cochés dans la liste");
			} else {
				System.out.println(item.getDescription() + " pas trouvés, non cochés");
			}
		}

		System.out.println("\n");

		for (ShoppingListItem item : liste_legumes.getItems()) { // utilisation du foreach pour traquer les elements
			// d'une lsite

			if (item.isChecked()) {
				System.out.println(item.getDescription() + " trouvés, donc cochés dans la liste");
			} else {
				System.out.println(item.getDescription() + " pas trouvés, non cochés");
			}

		}

		// Les courses ont été faites

		System.out.println("====================");
		System.out.println(
				"Après les courses, les pommes, haricots et broccolis ont été acheté, il reste donc sur les listes :");

		System.out.println("Contenu de la liste de fruits après les courses : ");
		for (int i = 0; i < liste_fruits.getItemCount(); i++) { // utilisation du foreach pour traquer les elements
																// d'une lsite
			if (liste_fruits.getItem(i).isChecked()) {
				liste_fruits.remove(i);
			} else {
				System.out.println(liste_fruits.getItem(i).getDescription());
			}
		}

		System.out.println("");

		System.out.println("Contenu de la liste de legumes après les courses: ");
		for (int i = 0; i < liste_legumes.getItemCount(); i++) { // utilisation du foreach pour traquer les elements
																	// d'une lsite
			if (liste_legumes.getItem(i).isChecked()) {
				liste_legumes.remove(i);
			} else {
				System.out.println(liste_legumes.getItem(i).getDescription());
			}
		}

	}

}
