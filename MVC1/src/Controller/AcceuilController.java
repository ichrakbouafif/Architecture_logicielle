package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ConnexionBD;
import View.Acceuil;
import View.FenetreAjout;
import View.FenetreSupprimer;

public class AcceuilController {

    private Acceuil acceuilView;
    private ConnexionBD connexionBD;

    public AcceuilController(Acceuil acceuilView, ConnexionBD connexionBD) {
        this.acceuilView = acceuilView;
        this.connexionBD = connexionBD;

        // Set up listeners
        acceuilView.getAjoutButton().addActionListener(new AjoutButtonListener());
        acceuilView.getSuppButton().addActionListener(new SuppButtonListener());
    }

    private class AjoutButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FenetreAjout fenaAjout = new FenetreAjout();
            // You can pass any required parameters to FenetreAjout constructor
        }
    }

    // ActionListener for "Supprimer un étudiant" button
    private class SuppButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            FenetreSupprimer fenSupp = new FenetreSupprimer();
            // You can pass any required parameters to FenetreSupprimer constructor
        }
    }
}
