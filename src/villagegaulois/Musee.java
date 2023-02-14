package villagegaulois;


import personnages.Equipement;
<<<<<<< HEAD
import personnages.Gaulois;
=======
>>>>>>> 166ecc0a0dbf626b516a248c9ebbbdfccac8e5eb

public class Musee {
	private Trophee[] tableauTrophee = new Trophee[200];
	private int nbTrophee = 0;
	
<<<<<<< HEAD
	public void donnerTrophee(Gaulois gaulois,Equipement equipement) {
=======
	public void donnerTrophee(personnages.Gaulois gaulois,Equipement equipement) {
>>>>>>> 166ecc0a0dbf626b516a248c9ebbbdfccac8e5eb
		Trophee trophee = new Trophee(gaulois,equipement);
		tableauTrophee[nbTrophee] = trophee;
		nbTrophee ++;
	}
	
	public String extraireInstructionCaml() {
		String texte = "let musee = [\n";
		for (int i=0;i<nbTrophee;i++) {
			texte +="\"";
			texte += tableauTrophee[i].donnerNom();
			texte += "\", \"";
			texte += tableauTrophee[i].getEquipement().toString();
			texte += "\"";
			if (i==nbTrophee-1) texte += ";";
			texte += "\n";
		}
		texte += "]";
		return texte;
	}
}