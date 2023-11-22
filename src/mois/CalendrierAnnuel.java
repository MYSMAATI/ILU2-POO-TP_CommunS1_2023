package mois;

public class CalendrierAnnuel {
	private Mois[] calendrier;

	public CalendrierAnnuel() {
		Mois[] tab = new Mois[12];
		String[] mois = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre",
				"Octobre", "Novembre", "Décembre" };

		int[] nbJours = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int i = 0;
		while (i < 12) {
			tab[i] = new Mois(mois[i], nbJours[i]);
			i++;
		}
		this.calendrier = tab;
	}

}
