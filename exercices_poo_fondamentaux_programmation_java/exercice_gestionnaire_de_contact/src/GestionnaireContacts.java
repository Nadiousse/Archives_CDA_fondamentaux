import java.util.ArrayList;

public class GestionnaireContacts {
    public ArrayList<Contact> listContact = new ArrayList<>();

    public void ajouterContact(Contact contact) {
        listContact.add(contact);
        System.out.println("Le contact a bien été ajouté.");
    }

    public void supprimerContact(String nom, String prenom) {
        for (int i = 0; i < listContact.size(); i++) {
            if (listContact.get(i).getNom().equals(nom) && listContact.get(i).getPrenom().equals(prenom)) {
                listContact.remove(i);
                System.out.println("Le contact a bien été supprimé.");
                break;
            }
            if (i == listContact.size() - 1) {
                System.out.println("Le contact n'a pas été trouvé.");
            }
        }
    }

    public void afficherContacts(){
        for (int i = 0; i < listContact.size(); i++) {
            System.out.println( (i+1) + ". " + listContact.get(i).getNom() + " " + listContact.get(i).getPrenom() + ": " + listContact.get(i).getNumeroTel() + " ; " + listContact.get(i).getMail() + " .");
        }
        System.out.println("Fin liste de contacts.");
    }

    public Contact chercherContact(String nom, String prenom){
        for (Contact contact : listContact){
            if (contact.getNom().equals(nom) && contact.getPrenom().equals(prenom)) {
                return contact;
            }
        }
        return null;
    }

    public String mettreAJourContact(String nom, String prenom, String mail){
        for (Contact contact : listContact){
            if (contact.getNom().equals(nom) && contact.getPrenom().equals(prenom)) {
                contact.setMail(mail);
                return ("Le mail a bien été modifié.");
            }
        }
        return "Le contact n'a pas été trouvé.";
    }
}