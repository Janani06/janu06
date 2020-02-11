class inheri2
{

private Base() 
{
	System.out.print("Base");
}

}

	public class Derived extends Base
	 {

		public Derived() 
		{	
			System.out.print("Derived");
		}
		 public static void main(String[] args)
		 {

			new Derived();

		 }

	}