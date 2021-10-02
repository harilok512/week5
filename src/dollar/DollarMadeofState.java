package dollar;

public class DollarMadeofState implements DollarState 
{

	@Override
	public void getDollarDetails(DollarContext c) {
		System.out.println("Dollars are made of 75 percent cotton and 25 percent linen.");
		c.setDollarState(this);
	}

	public String toString()
	{
		return "Dollar made of  State\n";
	}
}