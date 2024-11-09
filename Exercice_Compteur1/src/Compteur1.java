public class Compteur1 {
    private int val;

    public Compteur1() {
        this.val = 0;
    }

    public Compteur1(int v) {
        this.val = v;
    }

    public void Incrementer(int p) {
        this.val += p;
    }

    public void Decrementer(int p) {
        this.val -= p;
    }

    @Override
    public String toString() {
        return "Compteur de valeur" + this.val;
    }

    public static void main(String[] args) {
        Compteur1 C = new Compteur1(2);

        System.out.println("Avant l'incrementation");
        C.Incrementer(5);
        System.out.println("Apres l'incrementation");

        System.out.println("Avant la decrementation");
        C.Decrementer(1);
        System.out.println("Apres la decrementation");


    } 
} 
