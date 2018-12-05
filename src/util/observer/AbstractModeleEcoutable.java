package util.observer;

import java.util.ArrayList;

public class AbstractModeleEcoutable implements ModeleEcoutable {

	private ArrayList<EcouteurModele> ecouteurs;
	
	public AbstractModeleEcoutable()
	{
		ecouteurs=new ArrayList<>();
	}
	
	@Override
	public void addEcouteurModele(EcouteurModele e) 
	{
		ecouteurs.add(e);		
	}

	@Override
	public void removeEcouteurModele(EcouteurModele e)
	{
		ecouteurs.remove(e);		
	}
	
	protected void fireChangement()
	{
		for (EcouteurModele e : ecouteurs)
			e.changement(this);
	}

}
