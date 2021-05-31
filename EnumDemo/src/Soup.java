
public enum Soup {
	
	CHICKEN_SOUP(100), MUTTON_SOUP(150), TOMATO_SOUP(50), VEG_SOUP(20);

	private int price;
	
	private Soup(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
