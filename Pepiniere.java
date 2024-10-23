package DS2023;

class Pepiniere {
    private static final int MAX_PLANTES = 1000;
    private Plante[] inventaire;
    private int nbp;

    public Pepiniere() {
        inventaire = new Plante[MAX_PLANTES];
        nbp = 0;
    }

    public void ajoutPlante(Plante plante) {
        if (nbp < MAX_PLANTES) {
            inventaire[nbp++] = plante;
        } 
        else {
            System.out.println("Erreur : L'inventaire est plein");
        }
    }

    public void afficherInventaire() {
        for (int i = 0; i < nbp; i++) {
            inventaire[i].description();
        }
    }

    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nbp; i++) {
            if (inventaire[i] instanceof Arbre) {
                total += ((Arbre) inventaire[i]).absorptionCO2();
            }
        }
        return total;
    }

    public int compterArbresCaduques() {
        int count = 0;
        for (int i = 0; i < nbp; i++) {
            if (inventaire[i] instanceof Arbre) {
                Arbre arbre = (Arbre) inventaire[i];
                if (arbre.getTypeFeuillage().equals("Caduque")) {
                    count++;
                }
            }
        }
        return count;
    }

}

