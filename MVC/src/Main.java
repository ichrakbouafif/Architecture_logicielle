import Model.ConnexionBD;
import Model.Etudiant;

import View.Acceuil;
import View.FenetreAjout;
import View.FenetreSupprimer;

import Controller.AcceuilController;
import Controller.FenetreAjoutController;
import Controller.FenetreSupprimerController;

import Controller.AcceuilController;

public class Main {
    public static void main(String[] args) {
        ConnexionBD connexionBD = new ConnexionBD();

        Acceuil acceuilView = new Acceuil();
        FenetreAjout fenetreAjoutView = new FenetreAjout();

        AcceuilController acceuilController = new AcceuilController(acceuilView, connexionBD);
        FenetreAjoutController fenetreAjoutController = new FenetreAjoutController(fenetreAjoutView, connexionBD);
    }
}

