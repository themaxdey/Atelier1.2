
public class Moteur {
	private int carburant;
	private String modele;
	
	public boolean demarrer () {
		if (carburant == 0) {
			System.out.println("Moteur incapable de demarrer avec 0 litres");
			return false;
		} else {
			System.out.println("Moteur demarre avec " + carburant + " litres");
			carburant -= 1;
			return true;
		} 
	}
	
	public void arreter() {
		System.out.println("Moteur arrêter");
	}
	
	public int utiliser(int carburant) {
		if (carburant > this.carburant) {
			carburant = this.carburant;
			this.carburant = 0;			
		} else 
			this.carburant -= carburant;

		
		System.out.println("Le morteur utilise " + carburant + " litres");
		
		return this.carburant;
	}
	
	public void fairePlein(int carburant) {
		this.carburant += carburant;
		System.out.println("Plein de " + carburant + " litres");
	}
	
	public int getCarburant() {
		return this.carburant;
	}
	
	public void setCarburant(int carburant) {
		if (carburant < 0)
			throw new IllegalArgumentException("Quantite d'essence incorrecte "+ carburant);
		else 
			this.carburant = carburant;
	}
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	
}
