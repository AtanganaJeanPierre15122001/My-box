public class Ville {
    private String nomVille;

    private String nomPays;

    private int nbreHabitant;

    public Ville(){
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitant = 0;
    }

    public Ville(String pNom, int pNbre, String pPays)
    {
        System.out.println("Création d'une ville avec des paramètres !");
        nomVille = pNom;
        nomPays = pPays;
        nbreHabitant = pNbre;
    }

    public String getNom()
    {
        return nomVille;
    }
    /**
     * Retourne le nom du pays
     * @return le nom du pays
     */
    public String getNomPays()
    {
        return nomPays;
    }

    public int getNombreHabitant()
    {
        return nbreHabitant;
    }


    public void setNom(String pNom)
    {
        nomVille = pNom;
    }

    public void setNomPays(String pPays)
    {
        nomPays = pPays;
    }

    public void setNombreHabitant(int nbre)
    {
        nbreHabitant = nbre;
    }
}
}
