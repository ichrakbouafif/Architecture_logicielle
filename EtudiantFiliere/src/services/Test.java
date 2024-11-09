package services;

import org.hibernate.SessionFactory;
import java.util.List;

import DAO.EtudiantDAO;
import DAO.FiliereDAO;
import domaine.Etudiant;
import domaine.Filiere;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Config.getSessionFactory();

        EtudiantDAO etudiantDAO = new EtudiantDAO(sessionFactory);
        FiliereDAO filiereDAO = new FiliereDAO(sessionFactory);

        // Creating some departments
        Filiere filiere1 = new Filiere();
        filiere1.setNomfiliere("GL");
        filiereDAO.create(filiere1);

        Filiere filiere2 = new Filiere();
        filiere2.setNomfiliere("IOT");
        filiereDAO.create(filiere2);

        Filiere filiere3 = new Filiere();
        filiere3.setNomfiliere("Embarqué");
        filiereDAO.create(filiere3);

        Filiere filiere4 = new Filiere();
        filiere4.setNomfiliere("IA");
        filiereDAO.create(filiere4);

        // Creating some students
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setNometudiant("Student 1");
        etudiant1.setFiliere(filiere1);
        etudiantDAO.create(etudiant1);

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setNometudiant("Student 2");
        etudiant2.setFiliere(filiere2);
        etudiantDAO.create(etudiant2);

        Etudiant etudiant3 = new Etudiant();
        etudiant3.setNometudiant("Student 3");
        etudiant3.setFiliere(filiere3);
        etudiantDAO.create(etudiant3);

        Etudiant etudiant4 = new Etudiant();
        etudiant4.setNometudiant("Student 4");
        etudiant4.setFiliere(filiere4);
        etudiantDAO.create(etudiant4);

        Etudiant etudiant5 = new Etudiant();
        etudiant5.setNometudiant("Student 5");
        etudiant5.setFiliere(filiere4);
        etudiantDAO.create(etudiant5);
        System.out.println("===== Students created successfully =====");
        System.out.println();

        // Listing all students
        List<Etudiant> etudiants = etudiantDAO.getAll();
        System.out.println("===== List of students =====");
        System.out.println();

        for (Etudiant etudiant : etudiants) {
            System.out.println("Student Name: " + etudiant.getNometudiant() + " - Department: " + etudiant.getFiliere().getNomfiliere());
            System.out.println();

        }

        // Update student 4
        Etudiant etudiantToUpdate = etudiantDAO.read(4L);
        if (etudiantToUpdate != null) {
            etudiantToUpdate.setNometudiant("Updated Student 4");
            etudiantDAO.update(etudiantToUpdate);
        }

        // Delete student 3
        Etudiant etudiantToDelete = etudiantDAO.read(3L);
        if (etudiantToDelete != null) {
            etudiantDAO.delete(etudiantToDelete);
            System.out.println("Deleted student 3 successfully");
        }
        System.out.println("===== List of students after updating student 4 and deleting student 3 =====");
        System.out.println();


        // Listing all students after update and deletion
        List<Etudiant> updatedEtudiants = etudiantDAO.getAll();
        for (Etudiant etudiant : updatedEtudiants) {
            System.out.println("Student Name: " + etudiant.getNometudiant() + " - Department: " + etudiant.getFiliere().getNomfiliere());
            System.out.println();

        }

        // Closing the session factory
        sessionFactory.close();
    }
}
