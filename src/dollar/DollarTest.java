package dollar;

public class DollarTest {

	public static void main(String[] args) {
		DollarContext c=new DollarContext();
		AvailableState astate=new AvailableState();
		astate.getDollarDetails(c);
		System.out.println(c.getDollarState().toString());
		
		DollarMadeofState madeOf=new DollarMadeofState();
		madeOf.getDollarDetails(c);
		System.out.println(c.getDollarState().toString());
		
		DollarColorState color=new DollarColorState();
		color.getDollarDetails(c);
		System.out.println(c.getDollarState().toString());

	}

}
