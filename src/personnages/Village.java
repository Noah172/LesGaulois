package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	public static void main(String[] args) {

		Village village = new Village("“Village des Irréductibles" , 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
//	de 0 à 29
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(Asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		null
//		ça prend la 2eme position
		village.afficherVillageois();
		
	}
	public void afficherVillageois () {
		System.out.println("Dans le village du chef" + chef.getNom() + "vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-"+ villageois[i].getNom());
			
		}
	}
}
