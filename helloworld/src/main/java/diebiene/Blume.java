package diebiene;

public class Blume {

    private String farbe;
    private String art;

    public Blume(String farbe, String art)
    {
        this.setFarbe(farbe);
        this.setArt(art);
    }

    public String bestaeuben() {
        return "Biene war da";
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
}
