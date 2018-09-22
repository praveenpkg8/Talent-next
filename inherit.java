
class base
{
	public void show() {
		System.out.println("base show");
	}
}
class delivered extends base
{
	public void show() {
		System.out.println("delivered show");
	}
}

public class inherit {
	public static void main(String[] args)
	{
		base b = new delivered();
		b.show();
	}

}
