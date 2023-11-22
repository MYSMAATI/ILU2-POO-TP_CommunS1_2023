package mois;

public class Mois {
	private String nom;
	private boolean[] jours;
	
	public Mois(String nom,int nb_jours) {
		this.nom = nom;
		this.jours = new boolean[nb_jours];
	}
	
	public boolean estLibre(int jour) {
		return(jours[jour] == false);
	}
	
	public void reserver(int jour){
		if(jours[jour] == true) {
			throw new IllegalStateException("jour non libre");
		}
		jours[jour] = true;
	}
		
}
