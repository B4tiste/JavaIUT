package shopping;

public class ShoppingListItem {

	private String description;
	private boolean checked = false;

	public ShoppingListItem(String description) {
		super();
		this.description = description;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void toggleCheck() {
		checked = !checked;
	}

	public String getDescription() {
		return description;
	}

}
