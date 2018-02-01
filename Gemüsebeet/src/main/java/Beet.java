import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Beet<T extends Gemüse, U extends Person> {

    private List<T> gemüse;
    private static Random rnd = new Random();

    public Beet() {
        gemüse = new ArrayList<>();
    }
    /*                        // statt List<Moehre>
    public Beet() { moehren = new ArrayList<Moehre>(); }
        */


    // params Moehre!
    public void aussähen(List<T> zeug) {

        // m von T, weil C# das lockerer sieht.... Oida
        for (T m :
                zeug) {
            gemüse.add(m);
        }
    }

    public String bewirtschaften(U p) {

        if (p instanceof Gärtner) {
            for (T m :
                    gemüse) {
                m.bewässern();
                m.vernichtenFeind();
            }
            return "Alles erledigt";
        }

        if (p.getSkills() > 50)

        {
            int zufall = rnd.nextInt(2);
            switch (zufall) {
                case 0:
                    for (T m : gemüse) {
                        m.vernichtenFeind();
                    }
                    return "Alles vernichtet!";

                case 1:
                    for (T m : gemüse) {
                        m.bewässern();
                    }
                    return "Alles bewässert!";
            }
            return "blubb";
        }

        return "Nix gemacht";
    }

    public List<T> ernten() {
        // jede reife Kohlrabi wird geerntet
        List<T> kannWeg = new ArrayList<T>();


        // kannWeg = gemüse.FindAll(m = > m.isReif);
        kannWeg = gemüse.stream().filter(m -> m.isReif).collect(Collectors.<T>toList());

        gemüse.removeAll(kannWeg);
        // gemüse.RemoveAll(m => m.isReif);


        return kannWeg;
    }

    public static Random getRnd() {
        return rnd;
    }

    public static void setRnd(Random rnd) {
        Beet.rnd = rnd;
    }
}