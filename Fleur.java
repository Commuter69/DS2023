package DS2023;


class Fleur extends Plante {
    String couleur;
    private int moisF;

    public Fleur(String nom, double hauteur, int age, double prix, String couleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }


	public void description() {
        super.description();
        String msg;
		if (fleurir()==true) {
        	msg="OUI";
        }
        else {
        	msg="NON";
        }
        System.out.println("Couleur: " + couleur + ", En fleurs: " + msg);
    }

    public boolean fleurir() {
        return moisF >= 4 && moisF <= 6;
    }
}
