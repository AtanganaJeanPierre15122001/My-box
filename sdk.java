import java.util.Scanner;

public class sdk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier compris entre 1 et 10 : ");
        int i = sc.nextInt();
        System.out.println("Saisissez une chaîne : ");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : " + i + " et " + str);
        if (i < 0)
            System.out.println("Le nombre est négatif");
        else
            System.out.println("Le nombre est positif");

        switch (i)
        {
            case 1: System.out.println("Ce nombre est tout petit");
                break;
            case 2: System.out.println("Ce nombre est tout petit");
                break;
            case 3: System.out.println("Ce nombre est un peu plus grand");
                break;
            case 4: System.out.println("Ce nombre est un peu plus");
                break;
            case 5: System.out.println("Ce nombre est la moyenne");
                break;
            case 6: System.out.println("Ce nombre est tout de mêmegrand");
                break;
            case 7: System.out.println("Ce nombre est grand");
                break;
            default: System.out.println("Ce nombre est très grand,puisqu'il est compris entre 8 et 10");
        }
        System.out.println("FIN ! ");
    }
}