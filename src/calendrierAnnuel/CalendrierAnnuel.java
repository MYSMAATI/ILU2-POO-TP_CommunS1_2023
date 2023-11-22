package calendrierAnnuel;

public class CalendrierAnnuel {

	public class Mois {
		private String nom;
		private boolean[] jours;

		public Mois(String nom, int nb_jours) {
			this.nom = nom;
			boolean[] tab = new boolean[nb_jours];
			for (int i = 0; i < nb_jours; i++) {
				tab[i] = false;
			}
			this.jours = tab;
		}

		private boolean estLibre(int jour) {
			return (jours[jour - 1] == false);
		}

		private void reserver(int jour) {
			if (jours[jour - 1] == true) {
				throw new IllegalStateException("jour non libre");
			}
			jours[jour] = true;
		}

	}

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

	public boolean estLibre(int jour, int mois) {
		return (calendrier[mois - 1].estLibre(jour));
	}

	public boolean reserver(int jour, int mois) {
		boolean reponse = false;
		try {
			calendrier[mois - 1].reserver(jour);
			reponse = true;
		} catch (Exception e) {
			// do nothing
			e.printStackTrace();
		}
		return reponse;
	}

}
