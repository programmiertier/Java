package diebiene;

public class Biene {
    private String farbe = "schwarz-gelb gestreift";
    private int alter;
    private double gewicht;
    private egeschlecht wasdenn;
    private int blumenzahl;

    /* jetzt nicht
    private boolean weiblich = true;    */

    public Biene(){}
    public Biene(int alter, double gewicht, egeschlecht was)
    {
        this.alter = alter;
        this.gewicht = gewicht;
        this.wasdenn = was;

        getFarbe();
    }

    public void feiernGeburtstag()
    {
        this.alter++;
    }

    public String fliegen(double strecke)
    {
        // pro 100m 1g weniger
        double aenderung = strecke / 100;   // 1km wären 10g weniger
        if (this.gewicht >= aenderung)
        {
            this.gewicht -= aenderung;
            return "Ich hab es geschafft";
        }
        else
        {
            return "Das wird nix";
        }
    }

    public String futtern(double gramm)
    {
        // jedes Gramm Honig, führt dazu, dass sie 0,5g zunimmt
        double aenderung = gramm / 2;
        this.gewicht += aenderung;
        return "Jetzt bin ich satt, ich rolle in meine Wabe";
    }

    public String umwandlungGeschlecht()
    {
        // boolschestoggle
        // this.weiblich = !this.weiblich;

        // es wird immer das Gegenteil vom aktuellen Geschlecht
        if (this.wasdenn == egeschlecht.maennlich)
        {
            this.wasdenn = egeschlecht.weiblich;
            return "Nun bin ich weiblich";
        }
        else
        {
            this.wasdenn = egeschlecht.maennlich;
            return "Nun bin ich männlich";
        }
    }

    public String gehbestaeuben(Blume welche)
    {
        String result = welche.bestaeuben();
        return "Auftrag ausgeführt.Blume sagt:" + result;
    }

    // override von c# entfernt
    @Override
    public String toString()
    {
        return alter + " | " + gewicht + " | " + getWasdenn() + " | " + getFarbe();
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public egeschlecht getWasdenn() {
        return wasdenn;
    }

    public void setWasdenn(egeschlecht wasdenn) {
        this.wasdenn = wasdenn;
    }

    public int getBlumenzahl() {
        return blumenzahl;
    }

    public void setBlumenzahl(int blumenzahl) {
        this.blumenzahl = blumenzahl;
    }
}
