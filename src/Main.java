import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Scooter> parc = new ArrayList<Scooter>();

    public static void main(String []arg){

        showMenu();
        userChoice();

        Scooter scooter = new Scooter("kawa",150,"neuf");
    }
    public static void showMenu()
    {
        System.out.println("1. Louer un scooter ");
        System.out.println("2. Retour d'un scooter ");
        System.out.println("3. État d'un scooter ");
        System.out.println("4. Affichage de l'état du parc de scooters ");
        System.out.println("5. Affichage d'exploitation du parc de scooters ");
        System.out.println("6. Ajout de nouveaux scooters du parc ");
        System.out.println("0. Quitter \n");
    }


    public static void userChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("choisir une option");
        String menuChoice = scanner.nextLine();

        switch(menuChoice){
            case "1":
                louerUnScooter();
                showMenu();
                break;
            case "2":
                retournerUnScooter();
                showMenu();
                break;
            case "3":
                System.out.println("Choix:  état d'un scooter\n");
                showMenu();
                break;
            case "4":
                System.out.println("Choix: affichage de l'état du parc de scooters\n");
                showMenu();
                break;
            case "5":
                System.out.println("Choix: affichage d'exploitation du parcde scooters\n");
                showMenu();
                break;
            case "6":
                System.out.println("Model du scooter");
                String scootermodel = scanner.nextLine();
                System.out.println("etat du scooter");
                String scooteretat = scanner.nextLine();

                System.out.println("Kilometrage du scooter");
                String scooterKilometrage = scanner.nextLine();
                int intKilometrage = Integer.parseInt(scooterKilometrage);

                ajoutScooter(scootermodel,intKilometrage,scooterKilometrage);
                showMenu();
                userChoice();
                break;
            case "0":
                System.out.println("vous quittez le programme");
                break;
            default:
                showMenu();
                break;
        }
    }
    public static void louerUnScooter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est le n° d'identification du scooter:");
        String scooterIdlouer  = scanner.nextLine();
    }

    public static void retournerUnScooter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est le n° d'identification du scooter que vous voulez retournez:");
        String scooterIdlouer  = scanner.nextLine();
        System.out.println("Combien de kilomètre aez vous effectuez:");
        String KilometrageEffectuer  = scanner.nextLine();

    }

    public static void ajoutScooter(String modele,int Kilometrage, String etat){

        Scooter scooter = new Scooter(modele,Kilometrage,etat);
        parc.add(scooter);
        System.out.print(parc+ "\n");

    }
}
