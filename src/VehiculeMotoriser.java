
public class VehiculeMotoriser extends Vehicule{

	Moteur moteur = new Moteur();
	
	@Override
	public boolean demarrer() {
		
		return moteur.demarrer();
	}

	@Override
	public void arreter() {
		
		moteur.arreter();
	}
	
	public void fairePlein(int carburant) {
		moteur.fairePlein( carburant );
	}
	
	public VehiculeMotoriser(String modele, int carburant) {
		moteur.setCarburant( carburant );
		vehicule( modele );
	}
	
	public void rouler(int consommation) {
		int carburant = moteur.utiliser( consommation );
		
		if ( carburant == 0 ) {
			new PanneException( "Panne d'essence" );
		}
	}
	
	public int getEssence() {
		return moteur.getCarburant();
	}

}
