public class Contact {
    private String nom;
    private String prenom;
    private String numeroTel;
    private String mail;

    public Contact(String nom, String prenom, String numeroTel, String mail){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTel = numeroTel;
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        System.out.println("Le nom a bien été modifié.");
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
        System.out.println("Le prénom a bien été modifié.");
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
        System.out.println("Le numéro de téléphone a bien été modifié.");
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
        System.out.println("Le mail a bien été modifié.");
    }
}
