import java.util.*;
class country1
{
	int population;
	String country_name,capital;
	public country1(int population,String country_name,String capital)
	{
	this.population=population;
	this.country_name=country_name;
	this.capital=capital;
	}
}
class ArrayListDemo
	{
		public static void main(String args[])
		{
			List<country1>list=new ArrayList<country1>();
			country1 c1=new country1(1000,"INDIA","Delhi");
			country1 c2=new country1(2000,"AUSTRALIA","CANBERRA");
			country1 c3=new country1(3000,"AUSTRIA","VIENNA");
			list.add(c1);
			list.add(c2);
			list.add(c3);
			for(country1 c:list)
			{
				System.out.println(c.population+" "+c.country_name+" "+c.capital);
			}
		}
	}

