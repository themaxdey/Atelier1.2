
public class Test {

	public static void main( String[] args ) {
		
		Voiture Mazda = new Voiture( "Mazda", 40 );
		
		Mazda.demarrer();
		
		for ( int i = 0; i < 5; i++ ) {
			Mazda.rouler( 10 );
			
			if ( Mazda.getEssence() == 0 ) {
				Mazda.fairePlein( 50 );
			}
		}
		
		Mazda.arreter();
		

	}

}
