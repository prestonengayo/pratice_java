public class Livre {
    private String titre;
    private String auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre(String titre, String auteur, int anneePublication, boolean disponible){
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.disponible = disponible;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void  setAuteur(String auteur){
        this.auteur = auteur;
    }

    public String getAuteur(){
        return auteur;
    }

    public void setAnneePublication(int anneePublication){
        this.anneePublication = anneePublication;
    }

    public int getAnneePublication(){
        return  anneePublication;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public boolean getDisponible(){
        return  disponible;
    }

    public void afficherInfos(){
        System.out.println("Le titre du livre est : " + titre);
        System.out.println("Ecrit par : "+ auteur);
        System.out.println("Date de publication  : "+ anneePublication);
        System.out.println("Disponible   : "+ (disponible ? "Oui" : "Non"));
        System.out.println("-----------------------------------------------");
    }

    public void emprumter(){
        if (disponible){
            disponible = true;
            System.out.println("Le livre" +"  "+ titre + " est disponible");
        } else {
            System.out.println("Le livre " + " " + titre+ " a été déjà emprunter...");
        }
    }

    public void retouner(){
        disponible = true;
        System.out.println("Le livre" +" "+ titre  + " a été retourner et est maintenant disponible");
    }
}
