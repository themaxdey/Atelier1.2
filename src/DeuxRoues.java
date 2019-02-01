
public interface DeuxRoues {
	public default void changerPneuAvant(){
		System.out.println( "Changer pneu avant" );
	}
	
	public default void changerPneuArriere() {
		System.out.println( "Changer pneu arriere" );
	}
	
}
