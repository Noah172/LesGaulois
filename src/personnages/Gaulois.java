package personnages;

import villagegaulois.Musee;

public class Gaulois {
	private String nom;
	private int force;
	private int nbtrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion,romain);
//	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("Bonjour");
	}

	public void boirePotion(Gaulois gaulois, int forcePotion) {
		effetPotion = forcePotion;
		gaulois.parler(" Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");

	}
    public void faireUneDonation(Musee musee) {
	if (nbtrophees > 0) parler("Je donne au musee tous mes trophees :");
	for (int i = 0;i<nbtrophees;i++) {
		musee.donnerTrophee(this, trophees[i]);		// le this se refere lui-meme, (on est dans gaulois)
		System.out.println("-" + trophees[i].toString());
		trophees[i] = null;
	}
	nbtrophees = 0;
}

//	TP3
	private String prendreParole() {
		return ("Le gaulois " + nom + " : ");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbtrophees++) {
			this.trophees[nbtrophees] = trophees[i];
		}

	}

}