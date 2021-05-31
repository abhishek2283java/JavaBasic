
public class EnumDemoClass {

	public static void main(String[] args) {
		
		System.out.println("The values in the Direction enum are");
		for(Direction d : Direction.values()) {
			System.out.println(d);
		}
		
		Direction direction = Direction.EAST;
		System.out.println("My direction is " + direction);
		
		System.out.println("Price of chicken soup is " + Soup.CHICKEN_SOUP.getPrice());
		
		
	}

}
