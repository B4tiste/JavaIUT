package shopping;

import java.util.Scanner;

public class ShoppingListApp {

	private Scanner sc = new Scanner(System.in);
	private ShoppingList list = new ShoppingList();

	public static void main(String[] args) {
		ShoppingListApp app = new ShoppingListApp();
		app.launch();
	}

	private void launch() {
		// Boucle d'interaction
		boolean keepGoing = true;
		while (keepGoing) {
//			for (int t = 0; t < 50; t++) {
//				System.out.println("");
//			}
			System.out.println(
					"================================================================================================");
			displayListContent();
			displayMenu();
			String input = sc.nextLine();
			input = input.toLowerCase();
			if (input.equals("q")) {
				System.out.println("Fermeture de l'application");
				keepGoing = false;
			} else {
				processInput(input);
			}

			System.out.println(
					"================================================================================================");
		}
	}

	private void displayListContent() {

		int cpt = 0;

		if (list.getItemCount() == 0) {
			System.out.println("\tLa liste est actuellement vide\n");
		} else {
			for (int i = 0; i < list.getItemCount(); i++) {
				cpt++;

				if (list.getItem(i).isChecked()) {
					System.out.println(cpt + " - " + list.getItem(i).getDescription() + " [x]");
				} else {
					System.out.println(cpt + " - " + list.getItem(i).getDescription() + " [ ]");
				}

			}
		}

	}

	private void displayMenu() {
		System.out.println("+ : Ajouter un item \t - : enlever un item \t x : (Dé)cocher un item \t q : quitter");
	}

	private void processInput(String input) {
		switch (input) {
		case "+":
			newItemDialog();
			break;

		case "-":
			removeItemDialog();
			break;

		case "x":
			toggleCheckMarkDialog();
			break;

		default:
			System.out.println("Entrée invalide");
			break;
		}

	}

	private void newItemDialog() {

		System.out.println("Entrez ce que vous voulez ajouter à la liste de courses : ");

		String desc = sc.nextLine();

		ShoppingListItem item = new ShoppingListItem(desc);

		if (!desc.isEmpty()) {
			list.add(item);
		}

		sc.nextLine();

		// System.out.println("Ajout de l'item " + item.getDescription());

	}

	private void removeItemDialog() {
		int num = 0;

		System.out.println("\nEntrez le numéro de l'item à supprimer : ");

		if (sc.hasNextInt()) {
			num = sc.nextInt();

			if (num <= list.getItemCount() && num >= 0) {
				list.remove(num - 1);
			} else {
				System.out.println("La liste ne contient pas d'item n°" + num);
			}
		}

		// System.out.println("Retrait de " + list.getItem(num - 1).getDescription());
		sc.nextLine();

	}

	private void toggleCheckMarkDialog() {
		// System.out.println("x");

		int var = 0;

		System.out.println("Entrez le numéro d'item à coher/décocher (0 si aucun : )");

		if (sc.hasNextInt()) {
			var = sc.nextInt();

			if (var != 0 && var <= list.getItemCount() && var >= 0) {
				list.getItem(var - 1).toggleCheck();
			} else if (var == 0) {
				// Ne fait rien
			} else {
				System.out.println("La liste ne contient pas d'item n°" + var);
			}
		}

		sc.nextLine();

	}

}
