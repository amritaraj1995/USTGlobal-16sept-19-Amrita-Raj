
public class TestI 
{
	public static void main(String[] args)
	{
		//AutoMobile a = new AutoMobile();{we can't create a obj for interface and
		AutoMobile a;
		BMW b = new BMW();
		b.gear();
		b.gps();
		b.abs();
		System.out.println("========================");

		Toyota t = new Toyota();
		t.gear();
		t.gps();
		System.out.println("=========================");
	}

}
