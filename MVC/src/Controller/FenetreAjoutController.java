package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ConnexionBD;
import Model.Etudiant;
import View.FenetreAjout;

public class FenetreAjoutController {

    private FenetreAjout fenetreAjoutView;
    private ConnexionBD connexionBD;

    public FenetreAjoutController(FenetreAjout fenetreAjoutView, ConnexionBD connexionBD) {
        this.fenetreAjoutView = fenetreAjoutView;
        this.connexionBD = connexionBD;

        // Set up listeners
        fenetreAjoutView.getOkButton().addActionListener(new OkButtonListener());
        fenetreAjoutView.getCancelButton().addActionListener(new CancelButtonListener());
    }

    // ActionListener for "Ok" button
    private class OkButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int studentId = Integer.parseInt(fenetreAjoutView.getIdTextField().getText());
                Etudiant etudiant = new Etudiant(studentId, fenetreAjoutView.getNomTextField().getText());

                // Insert the student into the database
                connexionBD.insertStudent("INSERT INTO etudiants VALUES ('" + etudiant.getId() + "','" + etudiant.getNom() + "')");

                // Show success message
                JOptionPane.showMessageDialog(null, "Ajout avec succès!!", "Information", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                // Handle the case where the ID is not a valid integer
                JOptionPane.showMessageDialog(null, "Veuillez entrer un ID valide!", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // ActionListener for "Cancel" button
    private class CancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Hide the window
            fenetreAjoutView.setVisible(false);
        }
    }
}

