
public class Velo extends Vehicule implements DeuxRoues{
	
	public String modele;
	
	@Override
	public boolean demarrer() {
			System.out.println("Vélo démarre");
		return true;
	}

	@Override
	public void arreter() {
		System.out.println("Vélo arrête");
		
	}
	public Velo(String modele) {
		this.modele = modele;
	}
	
	public String getModele() {
		return this.modele;
	}
	
	

}
