package hellocucumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Decrivez votre classe Princesse ici.
 *
 * @author (votre Boukala Amine et GANDI Taric)
 * @version (un numero de version ou une date)
 */

@SuppressWarnings("unused")
public class Princesse
{
    // variables d'instance 
    private String nom;
    private boolean enVie = true;
    private Prince marieeA;
    private boolean estMariee = false;
     List<Enfant> enfants;
    
    /**
     * Constructeur d'objets de classe Princesse
     */
    public Princesse(String nom)
    {
       // initialisation des variables d'instance
       this.nom = nom;
       enfants  = new ArrayList<Enfant>();
    }
    public String getNom()
    {
        return nom;
    }
    
    public boolean meurt()
    {
            return enVie==false;
    }
    
    public List<Enfant> enfants()
	{
		return Collections.unmodifiableList(enfants);
	}
	
	public void ajouterUnEnfant(Enfant toto)
	{
		enfants.add(toto);
	}
    public boolean mangerPommeEnsorcelee()
    {
    	enVie=false;
        return  enVie==false; 
    }
    
    public boolean seReveille(){
    	
        if(enVie == false)
            {
                enVie = true;
            }
            return enVie;
    }
    
    public void seMarierA(Prince floriant)
    {
    	
		if(floriant.EstMarie()||this.estMariee)
        {
			this.divorcer();
			floriant.divorcer();
    	 }
		marieeA = floriant;
    	floriant.seMarieA(this);
    	this.estMariee = true;
    	floriant.estMarie = true;
    }
	public boolean estEnVie() {
		return enVie;
	}
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}
	public Prince getMarieeA() {
		return marieeA;
	}

	public boolean EstMariee() {
		return estMariee;
	}
	public void setEstMariee(boolean estMariee) {
		this.estMariee = estMariee;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void divorcer()
	{ 
	        marieeA.estMarie=false;	
	        marieeA=null;
	    	estMariee=false;
	       
	 }
    @Override
    public boolean equals(Object objet)
    {
	        if (objet == null) return false;
	        if (objet == this) return true;
	        if (!(objet instanceof Princesse))return false;
	        Princesse princesse = (Princesse)objet;
	        return princesse.getNom().equals(this.getNom());
	    }
   
    public void mangerFruit(String unfruit)
	{
		if(unfruit.equals("apple"))
		{
			this.mangerPommeEnsorcelee();
		}
		
		
	}
    
    public String afficherPremierEnfant()
    {
    	return (enfants.get(0).getNomEnfant());
    }
    
}
