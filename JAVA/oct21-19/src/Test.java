
public class Test {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "white";
		p.brand  = "Writometer";
		
		System.out.println("Cost is : "+p.cost);
		System.out.println("Color is : "+p.color);
		System.out.println("Brand is : "+p.brand);
		
		p.write();
		
		System.out.println("****************************************");
		
		Van v = new Van();
		v.cost = 300000;
		v.color = "White";
		System.out.println("Van cost is : "+v.cost);
		System.out.println("Van color is : "+v.color);
		v.move();
		
		Van v1 = new Van();
		v.cost = 500000;
		v.color = "Pink";
		System.out.println("Van cost is : "+v.cost);
		System.out.println("Van color is : "+v.color);
		v1.move();
	}

}
