package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup, Romain romain) {
//		assert romain.force >= 0;
//		int forcedebut = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("A�e");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert forcedebut > force;
//	}

	public void sEquiper(Equipement equipement, Romain romain) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + romain.nom + " est déjà bien protégé !");
			break;
		case 1:
			if (romain.equipement[0] == equipement) {
				System.out.println("Le soldat " + romain.nom + " possède déjà un " + equipement + " !");
			} else {
				romain.equipement[1] = equipement;
				System.out.println("Le soldat " + romain.nom + " s'équipe avec un " + equipement + ".");
				nbEquipement += 1;
			}
			break;
		default:
			romain.equipement[0] = equipement;
			System.out.println("Le soldat " + romain.nom + " s'équipe avec un " + equipement + ".");
			nbEquipement += 1;
		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		assert minus.force >= 0;
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE, minus);
		minus.sEquiper(Equipement.CASQUE, minus);
		minus.sEquiper(Equipement.BOUCLIER, minus);
		minus.sEquiper(Equipement.BOUCLIER, minus);

	}

//	TP3
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force == 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	private int CalculResistanceEquipement(int forceCoup) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipement[i] == null) {
			} else {
				equipementEjecte[nbEquipementEjecte] = equipement[i];
				nbEquipementEjecte++;
				equipement[i] = null;
			}
		}
		return equipementEjecte;
	}

}
