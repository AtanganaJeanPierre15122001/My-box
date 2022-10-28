import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;



public class Devoir {
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        String perso =new String() ;
        System.out.println("**********Bienvenue dans notre programme d'execution !!!**********");
        System.out.println("tous d'abord nous allons enregistrer vos informations dans un fichier texte veuillez entrer le nom de ce fihier :");
        String nomfich= sc.nextLine();
        PrintWriter sortie = new PrintWriter(new FileWriter(nomfich));
        char a = ' ', b = ' ', c = ' ',d =' ';




        DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        Date aujourdhui = new Date();
        String auday1 =mediumDateFormat.format(aujourdhui);
        sortie.println("la date de debut de l'execution du programme est : "+auday1);
        do {



            System.out.println("Veuillez entrer votre nom d'utilisateur svp");
            String n = sc.nextLine();
            System.out.println("Bienvenue " + n);
            sortie.println("l'utilisateur a pour nom :"+n);
            System.out.println(" Nous allons evaluer votre personnalité!!!!! ");

            do {
                System.out.println("aimez vous : 1-rester dans votre coin  2-Rester avec vos amis  ");
                a = sc.nextLine().charAt(0);
            } while (a != '1' && a != '2');
            do {
                System.out.println("si vous êtes confronté à un accident que feriez vous ? : 1- essayer de sauver les personnes en face de vous  2- fuir le plus rapidement possible pour ne pas être impliqué dans l'accident :");
                b = sc.nextLine().charAt(0);
            } while (b != '1' && b != '2');
            do {
                System.out.println("Quel endroit préferiez vous ? : 1- parc d'attraction  2- Bibliothèque ");
                c = sc.nextLine().charAt(0);
            } while (c != '1' && c != '2');

            if (a == '1' && b == '1' && c == '1')
            {
                perso = "Vous êtes une personne qui aime le calme mais qui connait ses priorité,prends ses responsabilités et qui s'amuse quand il le faut!!!";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else if (a == '1' && b == '1' && c == '2')
            {
                perso = "Vous êtes une personne qui aime beaucoup le calme mais qui connait ses priorité,prends ses responsabilités devant des situations  ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else if (a == '1' && b == '2' && c == '1')
            {
                perso = " Vous êtes une personne introvertie aui passe sa sécurité avant tous et aime par dessus tous s'amuser... ce n'est pas bien ooooo  ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else if (a == '1' && b == '2' && c == '2')
            {
                perso = "Vous êtes une personne introvertie qui ne pense qu'a elle même et n'aime pas cotoyer son entourage ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else if (a == '2' && b == '1' && c == '1')
            {
                perso = "Vous êtes une personne très sociale qui fait passer ses amis avant elle et connait s'amuser bref vous être une lumière pour votre entourage  ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else if (a == '2' && b == '1' && c == '2')
            {
                perso = "Vous êtes une personne très sociale qui fait passer ses amis avant elle mais qui aime aussi rester dans son coin pour prendre le temps de refléchir  ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else if (a == '2' && b == '2' && c == '1')
            {
                perso = "Vous êtes une personne la présence des autres mais qui ne prends pas ses responsabilité face aux situations mais qui prefere s'amuser ce n'est pes bien oooo  ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            else
            {
                perso = "Vous êtes une personne la présence des autres mais qui ne prends pas ses responsabilité face aux situations mais qui prefere rester dans son calme comme si il ne se passait rien ";
                System.out.println(perso);
                sortie.println("votre personnalité est :" + perso);
            }
            do {
                System.out.println("voulez vous recommencer O ou N");
                d = sc.nextLine().charAt(0);
            }while (d != 'O' && d != 'N');
        }while ( d =='O');
        DateFormat mediumDateFormat2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        Date aujourdhui2 = new Date();
        String auday2 =mediumDateFormat2.format(aujourdhui2);
        sortie.println("la date de fin  de l'execution du programme est : "+auday2);
        sortie.close();
        System.out.println("Notre programme est enfin terminé pour consulter les informations allez au fichier :"+nomfich);







    }
}


