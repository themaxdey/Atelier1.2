
public class Velo extends Vehicule implements DeuxRoues{
	
	public String modele;
	
	@Override
	public boolean demarrer() {
			System.out.println("V�lo d�marre");
		return true;
	}

	@Override
	public void arreter() {
		System.out.println("V�lo arr�te");
		
	}
	public Velo(String modele) {
		this.modele = modele;
	}
	
	public String getModele() {
		return this.modele;
	}
	
	

}
