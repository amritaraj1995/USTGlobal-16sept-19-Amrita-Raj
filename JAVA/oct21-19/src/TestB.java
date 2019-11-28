
public class TestB {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.name = "ganga";
		c.color = "pink";
		System.out.println("cow name is : "+c.name);
		System.out.println("Cow color is : "+c.color);
		c.eat();
		c.sleep();

		System.out.println("********************************");

		c.name = "rabri devi";
		c.color = "black";
		System.out.println("cow name is : "+c.name);
		System.out.println("Cow color is : "+c.color);
		c.eat();
		c.sleep();
	}
}
