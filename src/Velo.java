
public class Velo extends Vehicule implements DeuxRoues{

	@Override
	public boolean demarrer() {
			System.out.println("V�lo d�marre");
		return true;
	}

	@Override
	public void arreter() {
		System.out.println("V�lo arr�te");
		
	}

}
