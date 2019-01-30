
public abstract class Vehicule {
	
	public abstract boolean demarrer();	
	public abstract void arreter();
	
	private String modele;
	
	public String getModele() {
		return modele;
	}
	
	public void vehicule( String modele) {
		this.modele = modele;
	}
}
