
public class Reparateur implements DeuxRoues{

	private static String nom = "Marcel";
	
	public static void reparerRoueAvant(DeuxRoues object) {
		if ( object instanceof Velo ) {
			System.out.print( "Le r�parateur "+ Reparateur.getNom() + " travaille sur le v�lo de mod�le " +  ((Velo) object).getModele() + " : ");
		} else {
			System.out.print( "Le r�parateur "+ Reparateur.getNom() + " travaille sur la moto de mod�le " +  ((Moto) object).getModele() + " : ");
		}
		
		object.changerPneuAvant();
	}
	
	public static void reparerRoueArriere(DeuxRoues object) {
		if ( object instanceof Velo ) {
			System.out.print( "Le r�parateur "+ Reparateur.getNom() + " travaille sur le v�lo de mod�le " +  ((Velo) object).getModele() + " : ");
		} else {
			System.out.print( "Le r�parateur "+ Reparateur.getNom() + " travaille sur la moto de mod�le " +  ((Moto) object).getModele() + " : ");
		}
		
		object.changerPneuArriere();
	}
	
	public void setNomReparateur(String nom) {
		Reparateur.nom = nom;
	}
	
	public static String getNom () {
		return nom;
	}
	
	public static void main(String args[]) {
		reparerRoueAvant(new Moto("Suzuki", 10));
		reparerRoueArriere(new Velo("Trek"));
	}
	
}
