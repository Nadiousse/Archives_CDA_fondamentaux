import java.util.ArrayList;

public class ListeDeCourses {

    ArrayList<Article> listCourses = new ArrayList<Article>();

    public void ajouterArticle(Article article) {
        listCourses.add(article);
        System.out.println("L'article a bien été ajouté.");
    }

    public void retirerArticle(String nom) {
        for (Article article : listCourses) {
            if (article.getNom().equals(nom)){
                listCourses.remove(article);
                System.out.println("Le contact a bien été supprimé.");
                break;
            }
        }
        System.out.println("L'article n'a pas été trouvé.");
    }

    public double calculerTotal(){
        double total = 0;
        for (Article article : listCourses){
            total += article.prixTTC();
        }
        return total;
    }

    public void afficherListe(){
        for (Article article : listCourses) {
            System.out.println("- " + article.getNom());
        }
        System.out.println("Fin liste de courses.");
    }


}
