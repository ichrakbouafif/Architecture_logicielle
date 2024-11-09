import jade.core.Agent;
import jade.core.AID;
import jade.core.Runtime;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

public class Lanceur extends Agent {
    @Override
    /**
     * Cette méthode est appelée directement après la création de l'agent pour permettre
     * l'initialisation et l'affectation des différents comportements à cet agent
     */
    protected void setup() {
        // Donner un nom à l'agent
        String localname = "Interface";
        AID id = new AID(localname, AID.ISLOCALNAME);
        System.out.println("Je m'appelle " + getLocalName());

        // Récupération du conteneur (Main Container) en cours d'exécution de Jade
        Runtime rt = Runtime.instance();

        // Création du profil par défaut
        Profile p = new ProfileImpl();
        AgentContainer cc = rt.createAgentContainer(p);
        System.out.println("Le conteneur 1 est créé");

        // Agent controleur pour permettre la création des agents
        AgentController AgentFils = null;
        AgentController AgentFils2 = null;

        System.out.println("L'agent " + getLocalName() + " va lancer les deux agents AgentA et AgentB");

        try {
            // Création de l'agentA
            /* Création de l'agentA
             * cette commande est équivalente à la suivante:
             * java jade.Boot AgentA:msg.agentA
             */
            AgentFils = cc.createNewAgent("agentA", "msg.agentA", null);
            AgentFils.start();
            System.out.println("L'agentA est lancé");

            // Création de l'agentB
            AgentFils2 = cc.createNewAgent("agentB", "msg.agentB", null);
            AgentFils2.start();
            System.out.println("L'agentB est lancé");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




