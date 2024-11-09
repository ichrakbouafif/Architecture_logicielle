package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.ConnexionBD;
import View.FenetreSupprimer;

public class FenetreSupprimerContoller {

    private FenetreSupprimer fenetreSupprimerView;
    private ConnexionBD connexionBD;

    public FenetreSupprimerContoller(FenetreSupprimer fenetreSupprimerView, ConnexionBD connexionBD) {
        this.fenetreSupprimerView = fenetreSupprimerView;
        this.connexionBD = connexionBD;

        // Set up listeners
        fenetreSupprimerView.getOkButton().addActionListener(new OkButtonListener());
        fenetreSupprimerView.getCancelButton().addActionListener(new CancelButtonListener());
    }

    // ActionListener for "Ok" button
    private class OkButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int studentId = Integer.parseInt(fenetreSupprimerView.getIdTextField().getText());

                // Delete the student from the database
                connexionBD.deleteStudent("DELETE FROM etudiants WHERE id =" + studentId);

                // Show success message
                JOptionPane.showMessageDialog(null, "Suppression réussie!", "Information",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                // Handle the case where the ID is not a valid integer
                JOptionPane.showMessageDialog(null, "Veuillez entrer un ID valide!", "Erreur",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // ActionListener for "Cancel" button
    private class CancelButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Hide the window
            fenetreSupprimerView.setVisible(false);
        }
    }
}

