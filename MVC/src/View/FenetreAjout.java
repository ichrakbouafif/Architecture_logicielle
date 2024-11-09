package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Model.ConnexionBD;
import Model.Etudiant;

public class FenetreAjout extends JFrame{


		public JLabel id,nom;
			
			public JTextField idT,nomT;
			
			public JButton ok = new JButton("ok");
			public JButton cancel = new JButton("cancel");
			
			public FenetreAjout()
			{
				this.id = new JLabel("id");
				this.nom = new JLabel("nom");
				this.idT = new JTextField(20);
				this.nomT = new JTextField(20);
				setTitle("Ajout d'un étudiant");
				setLayout(new FlowLayout(1,50,50));
				setSize(700,400);
				setResizable(true);
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				this.add(id);
				this.add(idT);
				this.add(nom);
				this.add(nomT);
				this.add(ok);
				this.add(cancel);
				
				this.ok.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						Etudiant e = new Etudiant (Integer.parseInt(idT.getText()), nomT.getText());
						ConnexionBD gg = new ConnexionBD();
						gg.insertStudent("insert into etudiants values ('"+e.getId()+"','"+ e.getNom()+"')");
						JOptionPane.showMessageDialog(null, "Ajout avec succès!!", "Information",
		    					JOptionPane.INFORMATION_MESSAGE) ;
						
					}});
				
				this.cancel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						setVisible(false);
						
					}});
			}

			public JTextField getIdTextField() {
			    return idT;
			}

			public JTextField getNomTextField() {
			    return nomT;
			}

			public JButton getOkButton() {
			    return ok;
			}

			public JButton getCancelButton() {
			    return cancel;
			}

			
}
