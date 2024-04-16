public class TestListeDeCourses {
    public static void main(String[] args) {
        ListeDeCourses listeDeCourses = new ListeDeCourses();
// Ajout d'articles, avec et sans TVA spécifiée
        listeDeCourses.ajouterArticle(new Article("Pommes", 1.50, 5, 5.5)); // Avec TVA spécifiée
        listeDeCourses.ajouterArticle(new Article("Chocolat", 1.00, 2)); // Sans TVA spécifiée, donc 20% par défaut
        listeDeCourses.ajouterArticle(new Article("Lait", 0.90, 3, 5.5)); // Avec TVA spécifiée
// Affichage de la liste
        System.out.println("Liste de courses après ajout :");
        listeDeCourses.afficherListe();
// Calcul du coût total avec TVA
        double total = listeDeCourses.calculerTotal();
        System.out.println("Coût total (TVA incluse) : " + total + " €");
// Retirer un article
        listeDeCourses.retirerArticle("Pain");
// Affichage final de la liste
        System.out.println("Liste de courses après suppression :");
        listeDeCourses.afficherListe();
    }
}