package dao;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import domaine.Etudiant;

public class EtudiantDAO {

    public static void main(String[] args) {
        // Creating configuration object
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); // Populates the data from the configuration file

        // Creating session factory object
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating session object
        Session session = factory.openSession();

        // Creating transaction object
        Transaction t = session.beginTransaction();

        // Inserting the first student
        Etudiant e1 = new Etudiant();
        e1.setId(7);
        e1.setNom("emna");
        session.persist(e1); // Persisting the object

        // Inserting the second student
        Etudiant e2 = new Etudiant();
        e2.setId(8);
        e2.setNom("ala");
        session.persist(e2); // Persisting the object

        t.commit(); // Committing the transaction

        System.out.println("Successfully saved");

        // Listing all students
        List<Etudiant> etudiants = session.createQuery("from Etudiant", Etudiant.class).list();
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getId() + " " + etudiant.getNom());
        }

        // Clean up resources
        session.close();
        factory.close();
    }
}
