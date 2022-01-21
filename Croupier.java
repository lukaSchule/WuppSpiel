/**
 *
 */
public class Croupier extends Person 
{
    /*Konstruktor*/
    public Croupier()
    {
    }

    /*Methoden*/
    /**
     * 
     */
    public void spielen()
    {
        this.setzeAktErgebnis(0);
        while(this.gibAktErgebnis()< 10)
        {
            System.out.println("Der Croupier habt eine "+wuerfel.gibAktWert()+" gewürfelt. Der aktuelle Würfelwert beträgt "+this.gibAktErgebnis()+", der Croupier spielt weiter...");
            wuerfel.wuerfeln();
            warte();
            this.setzeAktErgebnis(this.gibAktErgebnis()+wuerfel.gibAktWert());
        }
        System.out.println("Der Croupier habt eine "+wuerfel.gibAktWert()+" gewürfelt. Der aktuelle Würfelwert beträgt "+this.gibAktErgebnis()+", der Croupier hört auf!");
    }
}//Ende Klasse: Croupier

