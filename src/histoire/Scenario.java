package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 12);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion(panoramix);
		panoramix.booster(panoramix, obelix);
		panoramix.booster(panoramix, asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("Aie");
		asterix.frapper(minus);
		minus.parler("J'abandonne");	
	}

}
