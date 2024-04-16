public class Article {
    private String nom;
    private double prixUnitaire;
    private int quantite;
    private double tva = 20.0f;

    public Article(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prixUnitaire = prix;
        this.quantite = quantite;
    }

    public Article(String nom, double prix, int quantite, double tva) {
        this.nom = nom;
        this.prixUnitaire = prix;
        this.quantite = quantite;
        this.tva = tva;
    }

    public double prixTTC(){
        double prixProduit = prixUnitaire + (prixUnitaire * tva / 100);
        return prixProduit * quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }
}
