public class Gemüse {
    public boolean isReif;

    public Gemüse()
    {
        this.isReif = false;
    }

    public String bewässern()
    {
        this.isReif = true;
                // this.GetType().Name
        return this.getClass().getName() + " wurde bewässert";
    }

    public String vernichtenFeind()
    {
        this.isReif = true;
        return "Feinde vernichtet";
    }
}
