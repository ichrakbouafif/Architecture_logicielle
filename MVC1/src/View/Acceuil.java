package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Acceuil extends JFrame{
	public JButton getAjoutButton() {
        return ajout;
    }

    public JButton getSuppButton() {
        return supp;
    }

public JLabel lab,id,nom;
	
	public JTextField idT,nomT;
	
	public JButton ajout = new JButton("Ajouter un étudiant");
	public JButton supp = new JButton("Supprimer un étudiant");
	
	public Acceuil()
	{
		this.lab = new JLabel("Gestion des étudiants");
		setTitle("Acceuil");
		setLayout(new FlowLayout(1,50,50));
		this.getContentPane().setBackground(Color.magenta);
		setSize(800,350);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(lab);
		this.add(ajout);
		this.add(supp);
		
		
		this.ajout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FenetreAjout fenajout = new FenetreAjout();
				
			}});
		
		this.supp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg1) {
				// TODO Auto-generated method stub
				FenetreSupprimer fenasuup = new FenetreSupprimer();
				
			}});
		
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Acceuil ihm = new Acceuil();
		Acceuil ihm = new Acceuil();
	}
}
