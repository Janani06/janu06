class Plant 
{ 
	Plant() 
	{

		System.out.println("Plant created");

	}

}

class Tree extends Plant 	
{ 
	Tree() 
	{
	
		
		super();
		System.out.println("Tree created"); 

	}

}

public class inheri1 
{

	public static void main(String args[]) 
	{ 
		Tree tree = new Tree();

	}

}
