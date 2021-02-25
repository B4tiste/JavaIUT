package shopping;

import java.util.ArrayList;

public class ShoppingList {

	private ArrayList<ShoppingListItem> items = new ArrayList<>();

	public ShoppingListItem getItem(int indice) {
		return items.get(indice);
	}

	public ArrayList<ShoppingListItem> getItems() {
		return items;
	}

	public int getItemCount() {
		return items.size();
	}

	public void add(ShoppingListItem item) {
		items.add(item);
	}

	public void remove(int indice) {
		items.remove(indice);
	}
}
