import java.util.*;
class TreeSetDemo
{
 	public static void main(String args[])
	{
	TreeSet<String>set=new TreeSet<String>();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	set.add("E");
	System.out.println("highest val: "+set.pollFirst());
	System.out.println("low val: "+set.pollLast());
	System.out.println("Subset: "+set.subSet("A", false,"C", true));
System.out.println("tailset:" +set.tailSet("D", false));
	}
}