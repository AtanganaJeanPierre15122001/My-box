import java.util.Scanner;


public class sdk {
    public static void main (String[] args)
    {
        /*char tableauCaractere[] = {'a','b','c','d','e','f','g'};
        int i = 0;
        while (i < 4)
        {
            System.out.println("A l'emplacement " + i +" du tableau nous avons = " +tableauCaractere[i]);
            i++;
        }
        System.out.println("\n");
        for( i = 0; i < 4; i++)
        {
            System.out.println("A l'emplacement " + i +" du tableau nous avons = " +tableauCaractere[i]);
        }*/

        char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int i = 0, emplacement = 0;
        char reponse = ' ',carac = ' ';
        Scanner sc = new Scanner(System.in);

        do {
            do {

                i = 0;
                System.out.println("Rentrez une lettre en minuscule, SVP ");

                        carac = sc.nextLine().charAt(0);

                while(i < tableauCaractere.length && carac != tableauCaractere[i])
                    i++;

                    if (i < tableauCaractere.length)
                        System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");


                    else
                        System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");

            }while(i >= tableauCaractere.length);

            do{
                System.out.println("Voulez-vous essayer de nouveau ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            }while(reponse != 'N' && reponse != 'O');


        }while (reponse == 'O');

        System.out.println("Au revoir !..");
    }
}
