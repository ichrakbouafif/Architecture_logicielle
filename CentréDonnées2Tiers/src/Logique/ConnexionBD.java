package Logique;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnexionBD {
    private Connection connexion;
    private Statement instruction;
    private ResultSet resultat;

    public ConnexionBD() {
        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionetudiants", "root", "root");
            instruction = connexion.createStatement();
            resultat = instruction.executeQuery("SELECT * FROM etudiants");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void arret() {
        try {
            resultat.close();
            instruction.close();
            connexion.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getStudents() {
        try {
            while (resultat.next()) {
                System.out.println(resultat.getInt("id") + ", " + resultat.getString("nom"));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertStudent(String req) {
        try {
            instruction.executeUpdate(req);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteStudent(String req) {
        try {
            instruction.executeUpdate(req);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
