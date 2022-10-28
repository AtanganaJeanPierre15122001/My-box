public class Main {
    public static void main(String[] args)
    {
        Ville v = new Ville();
        Ville v1 = new Ville("marseille", 123456, "france");
        Ville v2 = new Ville("rio", 321654, "brésil");
        System.out.println("\n v = "+v.getNom()+" ville de "+v.getNombreHabitant()+ " habitants se situant en "+v.getNomPays());
        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitant()+ " habitants se situant en "+v1.getNomPays());

        Ville temp = new Ville();
        temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitant()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitant()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        v1.setNom("Hong Kong");
        v2.setNom("Djibouti");
        System.out.println(" v1 = "+v1.getNom()+" ville de "+v1.getNombreHabitant()+ " habitants se situant en "+v1.getNomPays());
        System.out.println(" v2 = "+v2.getNom()+" ville de "+v2.getNombreHabitant()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

        Ville V = new Ville("lyon", 654, "france");
        Ville V2 = new Ville("lille", 123, "france");
        V.comparer(V2);
    }
}