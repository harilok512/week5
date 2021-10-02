package dollar;

public class AvailableState implements DollarState 
{

	@Override
	public void getDollarDetails(DollarContext c) {
		System.out.println("Dollars are available in $1, $2, $5, $10, $20, $50, and $100 notes.");
		c.setDollarState(this);
	}

	public String toString()
	{
		return "Denomination State\n";
	}
}
