package Flore;

import java.util.HashMap;

public class Carotte extends Vegetal implements IracePure {

	public Carotte()
	{
			super();
			this.dessin[3] = 'c';
			this.dessin[4] = 'C';
			
	}

	@Override
	public void SeReproduire(HashMap<String, Integer> panier) {

		panier.put("Carotte", panier.get("Carotte") + 3);
		
	}
}
