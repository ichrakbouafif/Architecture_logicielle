package aspects;

public aspect log {

    pointcut logIncrementOperation(): call(void metier.Compteur.Incrementer(int));

    before(): logIncrementOperation() {
        System.out.println("Avant l'incrementation");
    }

    after(): logIncrementOperation() {
        System.out.println("Apres l'incrementation");
    }

    pointcut logDecrementOperation(): call(void metier.Compteur.Decrementer(int));

    before(): logDecrementOperation() {
        System.out.println("Avant la decrementation");
    }

    after(): logDecrementOperation() {
        System.out.println("Apres la decrementation");
    }

}
