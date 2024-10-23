package DS2023;

class Arbre extends Plante {
    private String typeFeuillage;
    private final double AbsorMoyenne = 22;

    public Arbre(String nom, double hauteur, int age, double prix, String typeFeuillage) {
        super(nom, hauteur, age, prix);
        this.setTypeFeuillage(typeFeuillage);
    }

    public void description() {
        super.description();
        System.out.println("Type de feuillage: " + getTypeFeuillage() + ", Absorption CO2: " + absorptionCO2() + " g/jour");
    }

    public double absorptionCO2() {
        if (hauteur > 500) {
            return AbsorMoyenne + 3;
        }
        return AbsorMoyenne;
    }

	public String getTypeFeuillage() {
		return typeFeuillage;
	}

	public void setTypeFeuillage(String typeFeuillage) {
		this.typeFeuillage = typeFeuillage;
	}
}
