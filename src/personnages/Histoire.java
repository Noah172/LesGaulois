package personnages;

public class Histoire {
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix",5,10)
		Gaulois Obelix = new Gaulois("Obelix",10)
		Gaulois Asterix = new Gaulois("Asterix",8)
		Romain Minus = new Romain("Minus",27)
		
		Panoramix.parler("Je vais allez preparer une potion...");
		Panoramix.preparerPotion();
		Panoramix.booster(Obelix);
		Obelix.parler("Par baclanos, ce n'est pas juste");
		Asterix.boirePotion(6);
		Asterix.parler("Bonjour");
		Minus.parler("UN GAUU...UN GAUGAU...");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
	}
}
