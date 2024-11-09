public class AgentB extends Agent {
    // Initialiser l'agent
    @Override
    protected void setup() {
        addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                // Attente de message (de l'agentB)
                jade.lang.acl.ACLMessage ms = receive();
                if (ms == null) {
                    // Pendant que le message n'est pas encore arrivé le comportement est bloqué
                    block();
                } else {
                    System.out.println(ms.getContent());
                }
            }
        });

        // Suppression de l'agentB
        doDelete();
    }
}