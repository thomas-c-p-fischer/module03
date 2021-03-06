package fr.cmfp.tp4.quelMedecin.test;

import java.time.LocalTime;

import fr.cmfp.tp4.quelMedecin.bo.Adresse;
import fr.cmfp.tp4.quelMedecin.bo.Creneau;
import fr.cmfp.tp4.quelMedecin.bo.MedecinGeneraliste;


public class TestCreneau {
	public static void main(String[] args) {
		Adresse sh = new Adresse("ZAC du CMFP", 221, "B", "avenue", "Baker Street", 29200,
				"Brest");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);
		Creneau c1 = new Creneau(LocalTime.of(9, 0), 15, melanie);
		new Creneau(LocalTime.of(9, 15), 15, melanie);
		new Creneau(LocalTime.of(9, 30), 15, melanie);
		new Creneau(LocalTime.of(9, 45), 15, melanie);
		new Creneau(LocalTime.of(10, 00), 15, melanie);
		new Creneau(LocalTime.of(10, 15), 15, melanie);
		new Creneau(LocalTime.of(10, 30), 15, melanie);
		new Creneau(LocalTime.of(10, 45), 15, melanie);
		new Creneau(LocalTime.of(11, 15), 15, melanie);
		new Creneau(LocalTime.of(11, 30), 15, melanie);
		new Creneau(LocalTime.of(11, 45), 15, melanie);
		new Creneau(LocalTime.of(14, 0), 30, melanie);
		new Creneau(LocalTime.of(14, 30), 30, melanie);
		new Creneau(LocalTime.of(15, 0), 30, melanie);
		new Creneau(LocalTime.of(15, 30), 30, melanie);
		new Creneau(LocalTime.of(16, 0), 30, melanie);
		new Creneau(LocalTime.of(16, 30), 30, melanie);
		System.out.println("__________________________ Créneaux ______________________________");
		c1.afficher();
		System.out.println("Médecin associé à ce créneau : Dr " + c1.getMedecinGeneraliste().getNom());
		System.out.println("------------------------------------------------------------------");
		melanie.afficher();
	}
}
