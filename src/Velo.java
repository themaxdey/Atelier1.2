
public class Velo extends Vehicule implements DeuxRoues{

	@Override
	public boolean demarrer() {
			System.out.println("Vélo démarre");
		return true;
	}

	@Override
	public void arreter() {
		System.out.println("Vélo arrête");
		
	}

}
