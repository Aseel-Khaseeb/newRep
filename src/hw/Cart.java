package hw;
import java.util.ArrayList;

public class Cart 
{
	public ArrayList<Product> prodList;
	
	public Cart()
	{
		prodList = new ArrayList<Product>();
	}
	
	public int getSize()
	{
		return prodList.size();
	}
	
	public int getTotal()
	{
		int total = 0;
		int i = getSize();
		for(int j = 0; j<i; j++)
		{
			total += prodList.get(j).getPrice();
		}
		return total;
	}
}