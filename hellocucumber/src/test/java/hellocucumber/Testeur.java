package hellocucumber;

public class Testeur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Princesse blancheNeige = new Princesse ("Blanche Neige");
		if(blancheNeige.enfants.size()>0)
			System.out.println(blancheNeige.afficherPremierEnfant());
		else
			System.out.println("Blanche neige ne possède pas d'enfants");
	}
}
