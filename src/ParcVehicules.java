import java.util.ArrayList;

public class ParcVehicules {

	static ArrayList<Voiture> ListeVoiture = new ArrayList<Voiture>();
	static ArrayList<Moto> ListeMoto = new ArrayList<Moto>();

	public static void main( String[] args ) {
		new ParcVehicules( "Voiture", "Subaru", 5 );
		new ParcVehicules( "Voiture", "Hyundai", 1 );
		new ParcVehicules( "Voiture", "Renault", 6 );
		new ParcVehicules( "Moto", "Harley", 3 );
		new ParcVehicules( "Moto", "Suzuki", 0 );
		new ParcVehicules( "Moto", "Honda", 10 );
		
		tester();
	}

	public ParcVehicules( String type, String modele, int carburantInitial ) {

		if ( type.equals( "Voiture" ) ) {
			ListeVoiture.add( new Voiture(modele, carburantInitial) );
		} else {
			ListeMoto.add( new Moto(modele, carburantInitial) );
		}
	}

	public static void tester() {

		System.out.println( "\nTests véhicules" );

		for ( int i = 0; i < ListeVoiture.size(); i++ ) {
			System.out.println(
					"\nDémarrer le véhicule " + ( i + 1 ) + "  de type " + ListeVoiture.get( i ).getModele() );
			ListeVoiture.get( i ).demarrer();

			if ( ListeVoiture.get( i ).getEssence() == 0 ) {
				ListeVoiture.get( i ).fairePlein( 10 );
				ListeVoiture.get( i ).demarrer();
			}

			ListeVoiture.get( i ).arreter();
		}

		for ( int i = 0; i < ListeMoto.size(); i++ ) {
			System.out
					.println( "\nDémarrer le véhicule " + ( i + 1 ) + "  de type " + ListeMoto.get( i ).getModele() );
			ListeMoto.get( i ).demarrer();

			if ( ListeMoto.get( i ).getEssence() == 0 ) {
				ListeMoto.get( i ).fairePlein( 10 );
				ListeMoto.get( i ).demarrer();
			}

			ListeMoto.get( i ).arreter();
		}
	}

}
