public class AgentA extends Agent {
    // Initialiser l'agent
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                // Préparation du message à envoyer vers l'agentB
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                // Préciser les agents destinataires du message qui est l'agent Vendeur dans ce cas
                msg.addReceiver(new AID("agentB", AID.ISLOCALNAME));
                msg.setLanguage("English");
                msg.setOntology("weather-forecast-ontology");
                // Remplissage de contenu du message
                msg.setContent("Today it’s raining");
                // Envoyer le message à l'agentB
                send(msg);
            }
        });

        // Suppression de l'agentA
        doDelete();
    }
}
