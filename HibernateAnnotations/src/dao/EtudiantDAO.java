package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import domaine.Etudiant;

public class EtudiantDAO {

    private static SessionFactory factory;

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();

        // Ajouter des étudiants
        //ajouterEtudiant(15, "alice");
        //ajouterEtudiant(16, "med");
        
        //Supprimer des etudiants
        //supprimerEtudiant(11);
        
        //mettre a jour l'etudiant dont l'id = 22 set nom = salma
		mettreAJourEtudiant(22,"salma");

        // Consulter tous les étudiants
        consulterTousLesEtudiants();

        // Clean up resources
        factory.close();
    }


    public static void ajouterEtudiant(int id, String nom) {
        try (Session session = factory.openSession()) {
            Transaction t = session.beginTransaction();

            Etudiant etudiant = new Etudiant();
            etudiant.setId(id);
            etudiant.setNom(nom);
            session.persist(etudiant);

            t.commit();
            System.out.println("Étudiant ajouté avec succès.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void consulterEtudiant(int id) {
        try (Session session = factory.openSession()) {
            Transaction t = session.beginTransaction();

            Etudiant etudiant = session.get(Etudiant.class, id);
            if (etudiant != null) {
                System.out.println("Etudiant trouvé : " + etudiant.getId() + " " + etudiant.getNom());
            } else {
                System.out.println("Etudiant non trouvé avec l'ID : " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void consulterTousLesEtudiants() {
        try (Session session = factory.openSession()) {
            Transaction t = session.beginTransaction();

            List<Etudiant> etudiants = session.createQuery("from Etudiant", Etudiant.class).list();
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant.getId() + " " + etudiant.getNom());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mettreAJourEtudiant(int id, String nouveauNom) {
        try (Session session = factory.openSession()) {
            Transaction t = session.beginTransaction();

            Etudiant etudiant = session.get(Etudiant.class, id);
            if (etudiant != null) {
                etudiant.setNom(nouveauNom);
                session.update(etudiant);
                t.commit();
                System.out.println("Données de l'étudiant mises à jour avec succès.");
            } else {
                System.out.println("Etudiant non trouvé avec l'ID : " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Supprimer un étudiant par ID
    public static void supprimerEtudiant(int id) {
        try (Session session = factory.openSession()) {
            Transaction t = session.beginTransaction();

            Etudiant etudiant = session.get(Etudiant.class, id);
            if (etudiant != null) {
                session.delete(etudiant);
                t.commit();
                System.out.println("Etudiant supprimé avec succès.");
            } else {
                System.out.println("Etudiant non trouvé avec l'ID : " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
