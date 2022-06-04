package fr.univ_amu.iut;

import java.util.List;

import fr.univ_amu.iut.model.Academie;
import fr.univ_amu.iut.model.Discipline;
import fr.univ_amu.iut.model.Thematique;
import fr.univ_amu.iut.model.Usage;

public class Donnees {
    private static Academie academieSelectionee = null;
    private static Thematique thematiqueSelectionee = null;
    private static Discipline disciplineSelectionee = Discipline.Toutes;
    private static List<Usage> usagesObtenus;

    public static List<Usage> getUsagesObtenus() {
        return usagesObtenus;
    }
    public static void setUsagesObtenus(List<Usage> usagesObtenus) {
        Donnees.usagesObtenus = usagesObtenus;
    }
    public static Academie getAcademieSelectionee() {
        return academieSelectionee;
    }
    public static void setAcademieSelectionee(Academie academieSelectionee) {
        System.out.println("Academie Selectionée : %s".formatted(academieSelectionee.getNom()));
        Donnees.academieSelectionee = academieSelectionee;
    }
    public static Thematique getThematiqueSelectionee() {
        return thematiqueSelectionee;
    }
    public static void setThematiqueSelectionee(Thematique thematiqueSelectionee) {
        System.out.println("Thematique selectionée : %s".formatted((thematiqueSelectionee == null)? "Aucune Thematique" : thematiqueSelectionee.getNom()));
        Donnees.thematiqueSelectionee = thematiqueSelectionee;
    }
    public static Discipline getDisciplineSelectionee() {
        return disciplineSelectionee;
    }
    public static void setDisciplineSelectionee(Discipline disciplineSelectionee) {
        System.out.println("Discipline Selectionee : %s".formatted(disciplineSelectionee.getNom()));
        Donnees.disciplineSelectionee = disciplineSelectionee;
    }

    
}
