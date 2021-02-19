public class Scooter {

    public String modele;
    public final String etat;
    public String numID ;
    public final int Kilometrage ;
    public static long idCounteur = 1;

    Scooter(String modele, int kilometrage,String etat)
    {
        this.modele = modele;
        this.Kilometrage = kilometrage;
        this.etat = etat;
        this.numID = creatID();
    }

    private static synchronized String creatID(){
        return String.valueOf(idCounteur++);
    }
}
