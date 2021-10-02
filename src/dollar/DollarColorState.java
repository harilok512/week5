package dollar;

public class DollarColorState implements DollarState 
{

	@Override
	public void getDollarDetails(DollarContext c) {
		System.out.println("Dolloar notes are available in Beige,Blue,Green,Pink,Yellow and goldenrod orange colors");
		c.setDollarState(this);
	}

	public String toString()
	{
		return "Dollar Color State\n";
	}
}